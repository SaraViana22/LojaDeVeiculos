package Escola;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;
  
    public Aluno(){
        
    }

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            throw new IllegalArgumentException("Nota não pode ser menor que zero."); 
        }
    }
    
    public void entradaNome(Scanner scanner) {
        
        while (true) {
            
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
                
            if (nome.matches("[a-zA-Z\\s]+")) {
                this.nome = nome;
                break;
            } else {
                System.out.println("Entrada inválida! Nome não pode conter números ou caractres especiais.");
            }
        }
        
    }
    
    public void entradaIdade(Scanner scanner) {
        
        while (true) {
            try {
                System.out.println("Idade do aluno: ");
                int idade = scanner.nextInt();
                
                if (idade >= 18) {
                    this.idade = idade;
                    break;
                } else {
                    System.out.println("Este aluno não tem idade para fazer parte da grade escolar");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida!Digite apenas números.");
                scanner.nextLine();
            }
        }
        
    }
    
    public void entradaNota(Scanner scanner) {
        
        while(true) {
            try {
                System.out.println("Digite a nota do aluno: ");
                double nota = scanner.nextDouble();
                
                if (nota >= 0 && nota <= 10) {
                    this.nota = nota;
                    break;
                } else {
                    System.out.println("Nota inválida. Nota dever ser no mínimo 0 e no máximo 10.");
                }
            } catch(Exception e) {
                System.out.println("Nota inválida! Digite apenas números.");
                scanner.nextLine();
            }
        }
        
    }
    
    public void exibirDadosAluno() {
        System.out.println("\n========DADOS DO ALUNO========:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }
    
}