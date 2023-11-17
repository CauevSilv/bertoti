package Contas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {
    private double saldo;
    private String nome;
    private String cpf;

    public Cliente(double saldo, String nome, String cpf) {
        CPFFormatter formatter  = new CPFFormatter();
        String cpfFormatado =  formatter.formatCPF(cpf);
        if (!isValidCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido. Certifique-se de que o CPF esteja formatado corretamente.");
        }else {
            this.saldo = saldo;
            this.nome = nome;
            this.cpf = cpfFormatado;
        }
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
