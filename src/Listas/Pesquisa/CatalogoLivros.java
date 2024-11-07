package Listas.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() { this.livrosList = new ArrayList<>(); }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    //pesquisa livros por autor e retorna uma lista com os livros encontrados
    public List<Livro> pesquisarPorAutor (String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Pesquisar os livros por intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }

    //Pesquisar por titulo e retornar somente o primeiro livro
    public Livro pesquisarPorTitulo (String titulo){
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    //criando os livros e testando os metodos criados com os livros adicionados
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros(); //criando o objeto catalogo livros
        catalogoLivros.adicionarLivros("O Pequeno Principe", "Autor 1",1998);
        catalogoLivros.adicionarLivros("Livro 2", "Autor 2",2003);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 3",1999);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 4",2008);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1998,2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));
    }

}
