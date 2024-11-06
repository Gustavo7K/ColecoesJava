package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    //criando a lista de tarefas
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    //metodo de adicionar tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //remover tarefas na lista com loop para remover as tarefas desejadas
    public void removerTarefa(String descricao){
        List<Tarefa>tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){ //descricao da tarefa igual a descricao da tarefa pedida
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover); // sem o loop seria dificil identificar qual a tarefa a ser removida
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    //testando os metodos
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de tarefas na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("O numero total de tarefas na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}

