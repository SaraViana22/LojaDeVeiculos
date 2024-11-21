package LojaVeiculos;

import java.util.Scanner;

public class Carro extends Veiculo {
    private int qtdDePortas;

    public Carro(String marca, String modelo, int ano, int qtdDePortas) {
        super(marca, modelo, ano);
        this.qtdDePortas = qtdDePortas;
    }

    public Carro() {}

    public int getQtdDePortas() {
        return qtdDePortas;
    }

    public void setQtdDePortas(int qtdDePortas) {
        if (qtdDePortas == 2 || qtdDePortas == 4) {
            this.qtdDePortas = qtdDePortas;
        } else {
            throw new IllegalArgumentException("Apenas 2 ou 4 portas são aceitas.");
        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + qtdDePortas);
    }

    public void cadastrarQtdDePortas(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite o número de portas (2 ou 4): ");
                int portas = scanner.nextInt();
                setQtdDePortas(portas);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }
    }
}
