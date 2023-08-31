package Loja;

public class Funilaria {
	private Carros carroEmReparo;
    private String descricaoProblema;

    public Funilaria(Carros carroEmReparo, String descricaoProblema) {
        this.carroEmReparo = carroEmReparo;
        this.descricaoProblema = descricaoProblema;
    }

    public Carros getCarroEmReparo() {
        return carroEmReparo;
    }

    public void setCarroEmReparo(Carros carroEmReparo) {
        this.carroEmReparo = carroEmReparo;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }
}

