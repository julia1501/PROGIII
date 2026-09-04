import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorContas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        ContaBancaria conta1 = new ContaBancaria();
        conta1.numero = 1;
        conta1.titular = "Marcelo";
        conta1.saldo = 1500.00;
        contas.add(conta1);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numero = 2;
        conta2.titular = "Maria";
        conta2.saldo = 2300.50;
        contas.add(conta2);

        ContaBancaria conta3 = new ContaBancaria();
        conta3.numero = 3;
        conta3.titular = "João";
        conta3.saldo = 800.75;
        contas.add(conta3);

        double saldoTotal = 0;

        Iterator<ContaBancaria> i = contas.iterator();
        while (i.hasNext()) {
            ContaBancaria c = i.next();
            System.out.println("Conta Número: " + c.numero + " - Titular: " + c.titular);
            saldoTotal = saldoTotal + c.saldo;
        }

        System.out.println("------------------------");
        System.out.println("Saldo total acumulado no banco: R$ " + String.format("%.2f", saldoTotal));
    }
}
