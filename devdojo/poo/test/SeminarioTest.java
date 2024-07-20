package devdojo.poo.seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Alex", "Java");

        Aluno aluno1 = new Aluno("Joao", 19);
        Aluno aluno2 = new Aluno("Diogo", 22);

        Seminario seminario1 = new Seminario("Java POO", professor, new Aluno[]{aluno1, aluno2});
        Seminario seminario2 = new Seminario("C++ POO", professor);

        Seminario[] seminarios = {seminario1, seminario2};
        professor.setSeminarios(seminarios);

        Aluno aluno3 = new Aluno("Carlinha", 25);
        seminario1.addAluno(aluno3); // Este será adicionado
        seminario2.addAluno(aluno3); // Isto imprimirá uma mensagem dizendo que já está em outro seminário

        seminario1.printInfo();
        seminario2.printInfo();
    }
}
