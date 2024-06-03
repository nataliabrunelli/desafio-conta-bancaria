import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        while (continuar) {

            System.out.println("Digite [1] para depositar, [2] para sacar, [3] para consultar seu saldo e [0] para encerrar.");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Qual valor a ser depositado?");
                    saldo += scanner.nextDouble(); 
                    //Quando coloca o scanner já é uma entrada de dados! (ou seja, não precisa de um "sout")
                    System.out.println ("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 2:
                    System.out.println("Qual valor a ser sacado?");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                      saldo -= saque;
                      System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    } else { 
                      System.out.println("Saldo insuficiente"); 
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}