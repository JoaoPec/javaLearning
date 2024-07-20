package devdojo.poo.test;

import devdojo.poo.relacionamentos.Biblioteca;
import devdojo.poo.relacionamentos.Livro;

public class BibliotecaTest {
    public static void main(String[] args) {
        // Criar bibliotecas
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca de São Paulo");
        Biblioteca biblioteca2 = new Biblioteca("Biblioteca de Recife");
        Biblioteca biblioteca3 = new Biblioteca("Biblioteca do Rio");

        // Criar alguns livros
        Livro livro1 = new Livro("Biblia", "Jesus Cristo", 2999);
        Livro livro2 = new Livro("A queda de Zé", "Zé", 200);

        // Adicionar livros à primeira biblioteca
        biblioteca1.addBook(livro1);
        biblioteca1.addBook(livro2);

        // Listar livros na primeira biblioteca
        biblioteca1.listBooks();
        biblioteca3.listBooks();

        // Transferir um livro para a segunda biblioteca
        biblioteca1.transferBook(livro1, biblioteca2);

        // Listar livros nas duas bibliotecas após a transferência
        biblioteca1.listBooks();
        biblioteca2.listBooks();
    }
}
