package Contas;

public class Saldo{
    private double saldo;

    public Saldo(double valor){
        this.saldo = valor;
    }


    public double retirarSaldo(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
            getSaldo();
            return saldo;
        }else {
            this.saldo -= valor;
            return saldo;
        }
    }
    public double addSaldo(double valor){
        this.saldo +=valor;
        return saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}
