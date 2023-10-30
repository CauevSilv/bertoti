package Junit;
import Contas.Operacao;
import org.junit.Test;

import java.util.InputMismatchException;

public class Teste {
    @Test
    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.test(1000,3,300);
    }
    @Test
    public double test(double qtdMon, int tipoOperacao, double valorOperacao) {
        double numero = 0;
        try {
            Operacao op = new Operacao();
            op.depositar(qtdMon);
            int i = tipoOperacao;
            {
                switch (i) {
                    case 1 -> {
                        System.out.println("Quantos reais você deseja sacar?");
                        op.sacar(valorOperacao);
                    }
                    case 2 -> {
                        op.verSaldo();
                    }
                    case 3 -> {
                        System.out.println("Qual o valor que deseja depositar?");
                        op.depositar(valorOperacao);
                    }
                    case 4 -> {
                        System.out.println("Qual valor deseja transferir?");
                        System.out.println("Qual o nome da pessoa para a qual deseja transferir?");
                        op.transferir(valorOperacao, "Cleber");
                    }
                    case 5 -> {
                        System.out.println("Qual o valor do pagamento?");
                        op.pagar(valorOperacao);

                    }
                }
            }
            numero = op.verSaldo();
        } catch (InputMismatchException e) {
            System.out.println("String informada em um campo de número!\n");
        } catch (Exception e) {
            System.out.println(e);
        }
        return numero;
    }
}
