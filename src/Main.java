import model.ContaCorrente;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o titular da conta: ");
        String titular = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(numero, titular);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU CONTA CORRENTE ---");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para saque: ");
                    float valSaque = scanner.nextFloat();
                    if (conta.sacar(valSaque)) {
                        System.out.println("Saque realizado!");
                    } else {
                        System.out.println("Falha no saque. Verifique se há saldo ou se ultrapassou R$ 10.000.");
                    }
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    float valDep = scanner.nextFloat();
                    if (conta.depositar(valDep)) {
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Falha no depósito. O valor deve ser positivo e no máximo R$ 10.000.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}