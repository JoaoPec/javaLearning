package devdojo.poo.registroAlunos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    public String nome;
    public int idade;

    private static int contadorDeAluno = 0;
    private static final List<Aluno> listaDeAlunos = new ArrayList<>();

    static {
        System.out.println("Bloco de inicialização");
        listaDeAlunos.add(new Aluno("Alice", 20));
        listaDeAlunos.add(new Aluno("Bob", 22));
        contadorDeAluno = listaDeAlunos.size();
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void registrarAluno(Aluno aluno) {
        listaDeAlunos.add(aluno);
        contadorDeAluno++;
    }

    public int getTotalDeAlunos() {
        return contadorDeAluno;
    }

    public static void listarAlunos() {
        System.out.println("Listagem de alunos: ");
        for (Aluno a : listaDeAlunos) {
            System.out.println("Nome: " + a.nome + ", Idade: " + a.idade);
        }
    }
}
