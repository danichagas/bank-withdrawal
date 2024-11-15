import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Digite o número da conta: ");
        int number = sc.nextInt();
        System.out.print("Digite o titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Existe um valor inicial de depósito? (y/n): ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Digite o valor do depósito inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(account.toString());
        System.out.println();

        System.out.print("Digite o valor do depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(account.toString());

        System.out.println();
        System.out.print("Digite o valor para o saque: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(account.toString());

    }
}