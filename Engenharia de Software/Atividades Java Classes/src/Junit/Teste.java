package Junit;
import Contas.Operacao;
import Contas.Saldo;
import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    @Test
    public void test() {
        try {
            System.out.println("Bem vindo ao sistema do Banco 2!" +
                    "\nFaça seu login!");
            System.out.println("Informe seu nome.");
            String nome = "Cauê";
            System.out.println("Bem vindo(a) " + nome + "!\nEscreva o valor disponível na sua conta.");
            double qtdMon = 900;

            Operacao op = new Operacao();
            int opcao = 90;
                for (int i = 0; i !=6 ; i++) {
                    switch (i) {
                        case 1 -> {
                            System.out.println("Quantos reais você deseja sacar?");
                            op.sacar(40);
                        }
                        case 2 -> {
                            op.verSaldo();
                        }
                        case 3 -> {
                            System.out.println("Qual o valor que deseja depositar?");
                            op.depositar(400);
                        }
                        case 4 -> {
                            System.out.println("Qual valor deseja transferir?");
                            System.out.println("Qual o nome da pessoa para a qual deseja transferir?");
                            op.transferir(100,"Cleber");
                        }
                        case 5 -> {
                            System.out.println("Qual o valor do pagamento?");
                            op.pagar(300);

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
