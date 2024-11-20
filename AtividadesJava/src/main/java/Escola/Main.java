package Escola;
import java.util.Scanner;
import Escola.Aluno;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        aluno.entradaNome(scanner);
        aluno.entradaIdade(scanner);
        aluno.entradaNota(scanner);
        aluno.exibirDadosAluno();
        
        scanner.close();
    }
}
