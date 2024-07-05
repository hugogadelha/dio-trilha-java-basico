package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private static List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        OrdenacaoPessoa.pessoaList = new ArrayList<>();
    }

    public static void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade; 
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        OrdenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.60);
        OrdenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        OrdenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        OrdenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }

     
}
