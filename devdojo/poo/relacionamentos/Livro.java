package devdojo.poo.relacionamentos;

public class Livro {
    private String title;
    private String author;
    private int id;
    private Biblioteca biblioteca; // Nova referência à biblioteca

    public Livro(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
