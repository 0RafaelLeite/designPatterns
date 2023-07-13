package designPatterns.chainOfResponsability.cashWithdrawal;

import designPatterns.chainOfResponsability.cashWithdrawal.components.*;
import java.util.Scanner;
import static designPatterns.chainOfResponsability.cashWithdrawal.components.AbstractWithdraw.*;

public class BankInit {
    public static void main(String[] args) {

        Withdraw Withdraw2 = new Withdraw2();
        Withdraw Withdraw5 = new Withdraw5();
        Withdraw Withdraw10 = new Withdraw10();
        Withdraw Withdraw20 = new Withdraw20();
        Withdraw Withdraw50 = new Withdraw50();
        Withdraw Withdraw100 = new Withdraw100();

        Withdraw100.setNextValue(Withdraw50);
        Withdraw50.setNextValue(Withdraw20);
        Withdraw20.setNextValue(Withdraw10);
        Withdraw10.setNextValue(Withdraw5);
        Withdraw5.setNextValue(Withdraw2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor a ser sacado: R$");
        int value = sc.nextInt();

        Withdraw100.valueRequest(value);

        System.out.println(String.format("%d notas foram sacadas, sendo: \n %d notas de 100 \n %d notas de 50 \n %d notas de 20 \n %d notas de 10 \n %d notas de 5 \n %d notas de 2 reais \n\n O valor sacado foi de R$%d,00", banknotes, notes100, notes50, notes20, notes10, notes5, notes2, sum));

    }
}
