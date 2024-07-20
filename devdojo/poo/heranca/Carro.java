package devdojo.poo.heranca;

public class Carro extends Veiculo {

    private int numeroPortas;
    private String tipoDeCombustivel;

    public Carro(int numeroPortas, String tipoDeCombustivel) {
        super();
        this.numeroPortas = numeroPortas;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }
}