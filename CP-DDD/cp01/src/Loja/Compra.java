package Loja;

public class Compra {
	private Carros carroComprado;
    private double valor;
    private String data;

    public Compra(Carros carroComprado, double valor, String data) {
        this.carroComprado = carroComprado;
        this.valor = valor;
        this.data = data;
    }

    public Carros getCarroComprado() {
        return carroComprado;
    }

    public void setCarroComprado(Carros carroComprado) {
        this.carroComprado = carroComprado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


