package devdojo.poo.test;

import devdojo.poo.registroAlunos.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlinho", 19);

        System.out.println(aluno.getTotalDeAlunos());

        Aluno.registrarAluno(new Aluno("Matheuszinho", 24));

        System.out.println(aluno.getTotalDeAlunos());

        Aluno.listarAlunos();
    }

}
