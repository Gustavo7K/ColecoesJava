///O método hashCode em Java serve para organizar e agrupar objetos em listas,
/// de forma a localizar um objeto específico de forma mais rápida.

/// O hashCode é um número gerado a partir de uma propriedade de um objeto,
/// que serve para criar um identificador único para ele.

package Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    //Se dois codigos de convite forem iguais não sera possivel considerar o convidado na lista
    //Equals e hash code compara os atributos da classe para dizer se são iguais ou não (no caso o atributo codigoConvite)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                " codigoConvite=" + codigoConvite;
    }
}
