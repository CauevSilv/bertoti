package Junit;
import Contas.Operacao;
import Contas.Saldo;
import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    @Test
    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.test(1000,3,300);
    }
    @Test
    public void test(double qtdMon,int tipoOperacao, double valorOperacao) {
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
                            op.transferir(valorOperacao,"Cleber");
                        }
                        case 5 -> {
                            System.out.println("Qual o valor do pagamento?");
                            op.pagar(valorOperacao);

                        }
                    }
                }
                double numero = op.verSaldo();
                Assert.assertEquals(numero,0.0,0);
        } catch (InputMismatchException e) {
            System.out.println("String informada em um campo de número!\n");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
