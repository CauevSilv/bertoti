import Contas.Cliente;
import Contas.Operacao;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Bem vindo ao sistema do Banco 2!" +
                    "\nFaça seu login!");
            System.out.println("Informe seu CPF/CNPJ.");
            Scanner scanner = new Scanner(System.in);
            String cpfcnpj = scanner.next();
            System.out.println("Informe o nome do seu banco");
            String banco = scanner.next();
            System.out.println("Informe seu nome.");
            String nome = scanner.next();
            System.out.println("Qual o limite monetário de transferências, pagamentos e saques da sua conta?");
            double limite = scanner.nextDouble();
            System.out.println("Bem vindo(a) " + nome + "!\nEscreva o valor disponível na sua conta.");
            double qtdMon = scanner.nextDouble();

            Cliente cliente = new Cliente(qtdMon,nome,cpfcnpj,banco,limite);
            Operacao op = new Operacao();
            int opcao = 90;
            while (opcao != 0) {
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
                        op.sacar(cliente,scanner.nextDouble());
                    }
                    case 2 -> {
                        System.out.println("Seu saldo é de " + cliente.getSaldo());
                    }
                    case 3 -> {
                        System.out.println("Qual o valor que deseja depositar?");
                        op.depositar(cliente,scanner.nextDouble());
                    }
                    case 4 -> {
                        System.out.println("Qual valor deseja transferir?");
                        double transTemp = scanner.nextDouble();
                        System.out.println("Qual o nome da pessoa para a qual deseja transferir?");
                        op.transferir(cliente,transTemp, scanner.next());
                    }
                    case 5 -> {
                        System.out.println("Qual o valor do pagamento?");
                        op.pagar(cliente,scanner.nextDouble());

                    }
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("String informada em um campo de número!\n");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}


