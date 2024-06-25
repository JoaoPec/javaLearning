package devdojo.poo.seminario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Professor {
    private String nome;
    private String especialidade;
    private List<Seminario> seminarios = new ArrayList<>();

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        for (Seminario s : seminarios) {
            this.seminarios.add(s);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public List<Seminario> getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios.clear();
        this.seminarios.addAll(Arrays.asList(seminarios));
    }

    public void addSeminario(Seminario seminario) {
        this.seminarios.add(seminario);
    }

    public void printInfo() {
        System.out.println("Nome do Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Seminários ministrados:");
        for (Seminario seminario : seminarios) {
            System.out.println(" - " + seminario.getTitulo());
        }
    }
}
