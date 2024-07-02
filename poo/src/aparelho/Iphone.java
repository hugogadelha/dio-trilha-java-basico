package aparelho;

import funcionalidades.ipod.ReprodutorMusical;
import funcionalidades.safari.NavegadorInternet;
import funcionalidades.telefone.AparelhoTelefonico;
import multifuncional.EquipamentoMultifuncional;
import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        System.out.println("Bem-vindo ao iPhone! Escolha o aplicativo para iniciar:");
        System.out.println("1. Reprodutor Musical");
        System.out.println("2. Aparelho Telefônico");
        System.out.println("3. Navegador na Internet");

        int escolhaApp = scanner.nextInt();

        switch (escolhaApp) {
            case 1:
                ReprodutorMusical ipod = em;
                System.out.println("Iniciando iPod");

                System.out.println("Escolha a funcionalidade:");
                System.out.println("1. Tocar");
                System.out.println("2. Pausar");
                System.out.println("3. Selecionar Música");

                int escolhaFuncionalidadeIpod = scanner.nextInt();
                scanner.nextLine();  // Consumir nova linha

                switch (escolhaFuncionalidadeIpod) {
                    case 1:
                        ipod.tocar();
                        break;
                    case 2:
                        ipod.pausar();
                        break;
                    case 3:
                        System.out.println("Digite o nome da música:");
                        String musica = scanner.nextLine();
                        ipod.selecionarMusica(musica);
                        break;
                    default:
                        System.out.println("Funcionalidade inválida!");
                }
                break;

            case 2:
                AparelhoTelefonico telefone = em;
                System.out.println("Iniciando Telefone");

                System.out.println("Escolha a funcionalidade:");
                System.out.println("1. Ligar");
                System.out.println("2. Atender");
                System.out.println("3. Iniciar Correio de Voz");

                int escolhaFuncionalidadeTelefone = scanner.nextInt();
                scanner.nextLine();  // Consumir nova linha

                switch (escolhaFuncionalidadeTelefone) {
                    case 1:
                        System.out.println("Digite o número para ligar:");
                        String numero = scanner.nextLine();
                        telefone.ligar(numero);
                        break;
                    case 2:
                        telefone.atender();
                        break;
                    case 3:
                        telefone.iniciarCorreioVoz();
                        break;
                    default:
                        System.out.println("Funcionalidade inválida!");
                }
                break;

            case 3:
                NavegadorInternet safari = em;
                System.out.println("Iniciando Safari");

                System.out.println("Escolha a funcionalidade:");
                System.out.println("1. Exibir Página");
                System.out.println("2. Adicionar Nova Aba");
                System.out.println("3. Atualizar Página");

                int escolhaFuncionalidadeSafari = scanner.nextInt();
                scanner.nextLine();  // Consumir nova linha

                switch (escolhaFuncionalidadeSafari) {
                    case 1:
                        System.out.println("Digite o URL da página:");
                        String url = scanner.nextLine();
                        safari.exibirPagina(url);
                        break;
                    case 2:
                        safari.adicionarNovaAba();
                        break;
                    case 3:
                        safari.atualizarPagina();
                        break;
                    default:
                        System.out.println("Funcionalidade inválida!");
                }
                break;

            default:
                System.out.println("Aplicativo inválido!");
        }

        scanner.close();
    }
}
