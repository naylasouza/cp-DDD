package Loja.Testes;

import Loja.Carros;

public class Teste {
    public static void main(String[] args) {
        Carros carro1 = new Carros("Toyota", "Corolla", 2023, 30000.0);
        Carros carro2 = new Carros("Ford", "Fiesta", 2023, 25000.0);
        
        double somaPrecos = carro1.getPreco() + carro2.getPreco();
        double subtracaoPrecos = carro1.getPreco() - carro2.getPreco();
        
        System.out.println("Detalhes do Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Preço: $" + carro1.getPreco());
        
        System.out.println("\nDetalhes do Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Preço: $" + carro2.getPreco());
        
        System.out.println("\nSoma dos Preços: $" + somaPrecos);
        System.out.println("Subtração dos Preços: $" + subtracaoPrecos);
    }
}
