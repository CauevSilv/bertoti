package Contas;

public class Operacao{
    public void sacar(Cliente cliente,double valor) {
        if (cliente.getSaldo() < valor){
            System.out.println("Saldo insuficiente :(");
        } else {
            cliente.setSaldo(cliente.getSaldo()-valor);
            System.out.println("Seu novo saldo é de :" + cliente.getSaldo());
        }
        }
    public void depositar(Cliente cliente,double valor){
        cliente.setSaldo(cliente.getSaldo() + valor);
        System.out.println("Valor depositado! O seu saldo atual é : " + cliente.getSaldo());
    }
    public void pagar(Cliente cliente,double valor){
        cliente.setSaldo(cliente.getSaldo() - valor);
        }
    public void transferir(Cliente cliente,double valor,String nome1){
        if (cliente.getSaldo() < valor){
            System.out.println("Saldo insuficiente!");
            } else {
            cliente.setSaldo(cliente.getSaldo() - valor);
            System.out.println("R$" + cliente.getSaldo() + " transferidos para " + nome1);
        }

    }
}
