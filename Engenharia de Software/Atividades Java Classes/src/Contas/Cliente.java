package Contas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente extends Banco{
    private double saldo;
    private String nome;
    private String cpf;

    public Cliente(String nomeBanco, String nomeCliente, double saldo, String cpf) {
        super(nomeBanco, nomeCliente, saldo, cpf);
    }


    private boolean isValidCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Define a máscara do CPF
        String pattern = "^[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}-?[0-9]{2}$";

        // Verifica se o CPF atende à máscara usando expressão regular
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(cpf);

        return m.matches();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}
