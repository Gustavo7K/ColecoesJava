package Listas.Ordenacao;

import Listas.Ordenacao.Pessoa.ComparatorPorAltura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade); //usando o collections com o metodo sort para ordenar as pessoas por idade
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(); //instanciando

        ordenacaoPessoa.adicionarPessoa("Pessoa 1",22,1.90);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2",16,1.60);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3",25,1.80);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4",33,1.94);

        System.out.println(ordenacaoPessoa.pessoaList);// exibir somente a lista sem ordernar
        //System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
