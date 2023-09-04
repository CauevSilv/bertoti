import Contas.Operacao;
import Contas.Saldo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema do Banco 2!" +
                "\nFaça seu login!");
        System.out.println("Informe seu nome.");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        System.out.println("Bem vindo(a) "+ nome + "!\nEscreva o valor disponível na sua conta.");
        double qtdMon = scanner.nextDouble();
        Operacao op = new Operacao(nome,qtdMon);
        int opcao = 90;
        while (opcao != 0){
            System.out.println("\nO que deseja fazer," + nome +
                    "\n1- Sacar." +
                    "\n2- Ver saldo." +
                    "\n3- Depositar." +
                    "\n4- Transferir." +
                    "\n5- Pagar.");
            int opCase = scanner.nextInt();
            switch (opCase) {
                case 1 -> {
                    System.out.println("Quantos reais você deseja sacar?");
                    op.sacar(scanner.nextDouble());
                }
                    case 2 -> {
                        op.verSaldo();
                    }
                    case 3 ->{
                        System.out.println("Qual o valor que deseja depositar?");
                        op.depositar(scanner.nextDouble());
                    }
                    case 4 ->{
                        System.out.println("Qual valor deseja transferir?");
                        double transTemp = scanner.nextDouble();
                        System.out.println("Qual o nome da pessoa para a qual deseja transferir?");
                        op.transferir(transTemp,scanner.next());
                    }
                    case 5 ->{
                        System.out.println("Qual o valor do pagamento?");
                        op.pagar(scanner.nextDouble());

                    }
                }
            }

            }

        }


