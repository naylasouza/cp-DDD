package Loja;

public class Venda {
	    private Carros carroVendido;
	    private Cliente cliente;
	    private double valor;

	    public Venda(Carros carroVendido, Cliente cliente, double valor) {
	        this.carroVendido = carroVendido;
	        this.cliente = cliente;
	        this.valor = valor;
	    }

	    public Carros getCarroVendido() {
	        return carroVendido;
	    }

	    public void setCarroVendido(Carros carroVendido) {
	        this.carroVendido = carroVendido;
	    }

	    public Cliente getCliente() {
	        return cliente;
	    }

	    public void setCliente(Cliente cliente) {
	        this.cliente = cliente;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public void setValor(double valor) {
	        this.valor = valor;
	    }
	}
