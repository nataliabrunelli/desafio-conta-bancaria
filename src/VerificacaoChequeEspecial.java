import java.util.Scanner;

public class VerificacaoChequeEspecial {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu saldo atual: ");
    double saldo = scanner.nextDouble();
    System.out.println("Qual valor de saque desejado? ");
    double saque = scanner.nextDouble();

    // Define um limite para o cheque especial
    double limiteChequeEspecial = 500;

    // Verifica se o saque ultrapassa o saldo disponível
    if (saque <= saldo) {
      System.out.println("Transação realizada com sucesso.");
    } else if (saque <= saldo + limiteChequeEspecial) {
        System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
      } else {
          System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
  }
  
}
