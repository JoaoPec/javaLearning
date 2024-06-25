package devdojo.poo.relacionamentos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    // Construtor que inicializa apenas o nome
    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>(); // Inicializar a lista
    }

    // Construtor que inicializa o nome e a lista de livros
    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = new ArrayList<>(livros); // Inicializar a lista com os livros
        for (Livro livro : livros) {
            livro.setBiblioteca(this); // Definir a biblioteca para cada livro
        }
    }

    // Método para adicionar um livro
    public void addBook(Livro livro) {
        this.livros.add(livro);
        livro.setBiblioteca(this); // Atualizar a referência da biblioteca no livro
    }

    // Método para remover um livro
    public void removeBook(Livro livro) {
        this.livros.remove(livro);
        livro.setBiblioteca(null); // Remover a referência da biblioteca no livro
    }

    // Método para listar os livros
    public void listBooks() {
        System.out.println("\nLivros da " + this.nome);

        if (livros.isEmpty()) {
            System.out.println("\nNão existem livros disponíveis para esta biblioteca");
        }

        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitle() + " ID: " + livro.getId() + " Autor: " + livro.getAuthor());
        }
    }

    // Método para transferir um livro para outra biblioteca
    public void transferBook(Livro livro, Biblioteca novaBiblioteca) {
        this.removeBook(livro); // Remover o livro da biblioteca atual
        novaBiblioteca.addBook(livro); // Adicionar o livro à nova biblioteca
    }

    // Getters e Setters, se necessário
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
