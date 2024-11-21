package LojaVeiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();

        System.out.println("======= CADASTRO DE VEÍCULO =======");
        System.out.println("Digite a marca: ");
        carro.setMarca(scanner.nextLine());

        System.out.println("Digite o modelo: ");
        carro.setModelo(scanner.nextLine());

        while (true) {
            try {
                System.out.println("Digite o ano (2000 a 2024): ");
                int ano = scanner.nextInt();
                if (ano >= 2000 && ano <= 2024) {
                    carro.setAno(ano);
                    break;
                } else {
                    System.out.println("Ano inválido! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.nextLine();
            }
        }

        carro.cadastrarQtdDePortas(scanner);

        System.out.println("\n======= DADOS DO VEÍCULO =======");
        carro.exibirDetalhes();

        scanner.close();
    }
}

