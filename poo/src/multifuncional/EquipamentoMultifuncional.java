package multifuncional;
import funcionalidades.ipod.ReprodutorMusical;
import funcionalidades.safari.NavegadorInternet;
import funcionalidades.telefone.AparelhoTelefonico;


public class EquipamentoMultifuncional implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println("LIGANDO");
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA WEB");
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA PÁGINA WEB");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

    public void tocar(){
        System.out.println("TOCANDO MÚSICA");
    }

    public void pausar(){
        System.out.println("PAUSANDO MÚSICA");
    }

    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MÚSICA");
    }
}