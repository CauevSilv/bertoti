package Contas;

public class Operacao{
    private String nome;
    Saldo saldo = new Saldo();
    public Operacao(String nome,double valor){
        this.nome = nome;
        saldo.setSaldo(valor);
    }
    public void sacar(double valor) {
        saldo.setSaldo(saldo.getSaldo() - valor);
        System.out.println("O novo saldo é " + saldo.getSaldo());
        }
    public void depositar(double valor){
        saldo.setSaldo(saldo.getSaldo() + valor);
        System.out.println("O novo saldo é " + saldo.getSaldo());
    }
    public void pagar(double valor){
        saldo.setSaldo(saldo.getSaldo() - valor);
        System.out.println("Conta paga!!! Segue seu novo saldo: " + saldo.getSaldo());

    }
    public void transferir(double valor,String nome1){
        saldo.setSaldo(saldo.getSaldo() - valor);
        System.out.println(valor + " foi transferido para " + nome1);
    }
    public void verSaldo(){
        System.out.println("Seu saldo é R$" + saldo.getSaldo());
    }
}
