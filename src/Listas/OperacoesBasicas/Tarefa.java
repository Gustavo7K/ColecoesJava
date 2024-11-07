package Listas.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() { //metodo ToString para sobrescrever o metodo mudando a mensagem da tarefa
        return descricao;
    }
}
