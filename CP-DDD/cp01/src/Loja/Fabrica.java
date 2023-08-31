package Loja;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private String nome;
    private String endereco;
    private List<Carros> carrosFabricados;

    public Fabrica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.carrosFabricados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Carros> getCarrosFabricados() {
        return carrosFabricados;
    }

    public void fabricarCarro(String marca, String modelo, int ano, double preco) {
        Carros novoCarro = new Carros(marca, modelo, ano, preco);
        carrosFabricados.add(novoCarro);
    }
}
