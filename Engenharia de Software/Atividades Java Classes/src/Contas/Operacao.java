package Contas;

public class Operacao extends Saldo{

    public Operacao(double valor) {
        super(valor);
    }

    public void sacar(double valor) {
        retirarSaldo(valor);
        }
    public void depositar(double valor){
        addSaldo(valor);
        System.out.println("O novo saldo é " + getSaldo());
    }
    public void pagar(double valor){
        retirarSaldo(valor);
        System.out.println("Conta paga!!! Segue seu novo saldo: " + getSaldo());

    }
    public void transferir(double valor,String nome1){
        retirarSaldo(valor);
        System.out.println(valor + " foi transferido para " + nome1);
    }
    public double verSaldo(){
        return getSaldo();
        //System.out.println("Seu saldo é R$" + saldo.getSaldo());
    }
}
