import java.util.Scanner;

public class ControleSimplesDeSaques {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o limite de saque diário: ");
    double limiteDiario = scanner.nextDouble();

    // Loop for para iterar sobre os saques
    for (int i = 1; limiteDiario > 0 ; i++) {

      System.out.println("Digite o valor do saque: ");
      double valorSaque = scanner.nextDouble();

      if (valorSaque == 0) {
        System.out.println("Transacoes encerradas.");
        break; // Encerra o loop
      } else if (valorSaque > limiteDiario) {
          System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
          break; // Encerra o loop
        } else {
            limiteDiario -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
          }
    }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
  }
  
}
