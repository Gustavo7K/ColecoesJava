package Listas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<NumerosInteiros> numerosList;

    public SomaNumeros(){this.numerosList = new ArrayList<>();}


    public void adicionarNumero (int numero){
        numerosList.add(new NumerosInteiros(numero));
    }

    //calcular a soma de todos os numeros da lista
    public int calcularSoma(){
        int valorTotal = 0;
        if (!numerosList.isEmpty()) { //se nao estiver vazio
            for (NumerosInteiros numeros : numerosList) {
                int total = numeros.getNumeros();
                valorTotal += total; //valorTotal = valorTotal + total de numeros;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
     //para encontrar o maior numero dentre os numeros da lista
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE; //MIN_VALUE = Uma constante que possui o menor valor que um int pode ter
        if (!numerosList.isEmpty()) {
            for (NumerosInteiros numero : numerosList) {
                if (numero.getNumeros() >= maiorNumero) {
                    maiorNumero = numero.getNumeros();
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //para encontrar o menor numero dentre os numeros da lista
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE; //MAX_VALUE = Uma constante que possui o maior valor que um int pode ter
        if (!numerosList.isEmpty()) {
            for (NumerosInteiros numero : numerosList) {
                if (numero.getNumeros() <= menorNumero) {
                    menorNumero = numero.getNumeros();
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número da lista = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número da lista = " + somaNumeros.encontrarMenorNumero());
    }
}
