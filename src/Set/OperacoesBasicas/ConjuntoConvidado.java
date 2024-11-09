package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){ //Remove um convidado do conjunto com base no código do convite.
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){ //Conta o número total de convidados no Set.
        return convidadoSet.size();
    }

    public void exibirConvidados(){ //Exibe todos os convidados do conjunto.
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        //System.out.println("Existem "+ conjuntoConvidado.contarConvidados() +" convidados dentro do Set de convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1",123);
        conjuntoConvidado.adicionarConvidado("Convidado 2",232);
        conjuntoConvidado.adicionarConvidado("Convidado 3",345);
        conjuntoConvidado.adicionarConvidado("Convidado 4",456);
        conjuntoConvidado.adicionarConvidado("Convidado 5",456);//não sera salvo pois esta repetido

        System.out.println("Existem "+ conjuntoConvidado.contarConvidados() +" convidados dentro do Set de convidados");
        conjuntoConvidado.removerConvidadoPorCodigoConvite(123);
        conjuntoConvidado.exibirConvidados();
    }
}
