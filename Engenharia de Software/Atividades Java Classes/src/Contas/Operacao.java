package Contas;

public class Operacao extends Cliente{

    public Operacao(double saldo, String nome, String cpf) {
        super(saldo, nome, cpf);
    }

    public void sacar(double valor) {
        if (getSaldo() < valor){
            System.out.println("Saldo insuficiente :(");
        } else {
            setSaldo(getSaldo()-valor);
            System.out.println("Seu novo saldo é de :" + getSaldo());
        }
        }
    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Valor depositado! O seu saldo atual é : " + getSaldo());
    }
    public void pagar(double valor){
        sacar(valor);
        }
    public void transferir(double valor,String nome1){
        if (getSaldo() < valor){
            System.out.println("Saldo insuficiente!");
            } else {
            setSaldo(getSaldo() - valor);
            System.out.println("R$" + getSaldo() + " transferidos para " + nome1);
        }

    }
}
