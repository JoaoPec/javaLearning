package devdojo.poo.seminario;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Seminario(String titulo, Professor professor) {
        this.titulo = titulo;
        this.professor = professor;
    }

    public Seminario(String titulo, Professor professor, Aluno[] alunos) {
        this.titulo = titulo;
        this.professor = professor;
        for (Aluno aluno : alunos) {
            addAluno(aluno); // Utilize o método addAluno para adicionar os alunos
        }
    }

    public void addAluno(Aluno aluno) {
        if (aluno.getSeminario() != null) {
            System.out.println("Aluno " + aluno.getNome() + " já está em um seminário.");
            return;
        }
        this.alunos.add(aluno);
        aluno.setSeminario(this); // Defina o seminário do aluno para este seminário
    }

    public void printInfo() {
        System.out.println("Seminário: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor ministrando: " + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor designado.");
        }
        System.out.println("Alunos inscritos:");
        for (Aluno aluno : alunos) {
            System.out.println(" - " + aluno.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }
}
