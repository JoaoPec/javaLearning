package devdojo.poo.heranca;

import java.time.LocalDate;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private float preco;

    public Veiculo(String marca, String modelo, int ano, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);  // Chama o método setAno para validar o ano
        setPreco(preco);  // Chama o método setPreco para validar o preço

        System.out.println("\n" + this.toString() + "\n");

    }

    // Sobrescrevendo o método toString para formatar a saída dos atributos
    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        LocalDate date = LocalDate.now();
        if (ano > date.getYear() || ano <= 0) {
            System.out.println("Digite um ano válido");
            return;
        }
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco <= 0) {
            System.out.println("Digite um preço válido");
            return;
        }
        this.preco = preco;
    }
}
