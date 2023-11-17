package Contas;

public class Banco {
    private String nomeBanco;

    Cliente cliente;

    public Banco(String nomeBanco,String nomeCliente,double saldo,String cpf){
        Cliente cliente = new Cliente(nomeBanco,nomeCliente,saldo,cpf);
        this.cliente  = cliente;
        this.nomeBanco = nomeBanco;
    }

    public void addSaldo(double valor){
        cliente.setSaldo(cliente.getSaldo() + valor);
        System.out.println("Seu novo saldo é de :" + cliente.getSaldo());
    }
    public void removeSaldo(double valor){
        cliente.setSaldo(cliente.getSaldo() - valor);
        System.out.println("Seu novo saldo é de :" + cliente.getSaldo());

    }


}
