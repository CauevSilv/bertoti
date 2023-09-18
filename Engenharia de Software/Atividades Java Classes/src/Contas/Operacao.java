package Contas;

public class Operacao{
    private String nome;
    Saldo saldo = new Saldo(0);
    public void sacar(double valor) {
        saldo.retirarSaldo(valor);
        }
    public void depositar(double valor){
        saldo.addSaldo(valor);
        System.out.println("O novo saldo é " + saldo.getSaldo());
    }
    public void pagar(double valor){
        saldo.retirarSaldo(valor);
        System.out.println("Conta paga!!! Segue seu novo saldo: " + saldo.getSaldo());

    }
    public void transferir(double valor,String nome1){
        saldo.retirarSaldo(valor);
        System.out.println(valor + " foi transferido para " + nome1);
    }
    public double verSaldo(){
        return saldo.getSaldo();
        //System.out.println("Seu saldo é R$" + saldo.getSaldo());
    }
}
