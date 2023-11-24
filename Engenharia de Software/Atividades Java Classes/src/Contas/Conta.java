package Contas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Conta extends Banco{
    private int numeroConta;
    private double maxCredito;
    private int codVerificador;
    private LocalDateTime ultDataTrans;
    private double limiteAtual;

    public Conta(String nomeBanco,double maxCredito) {
        super(nomeBanco);
        Random rd = new Random();
        this.numeroConta = rd.nextInt(100000);
        this.maxCredito = maxCredito;
        this.codVerificador = rd.nextInt(299);
    }

    public Boolean updateDate(){
        LocalDateTime datahj = LocalDateTime.now();
        Boolean aux;
        if (verificaUpDate(datahj)){
            this.ultDataTrans = LocalDateTime.now();
            aux = true;
        } else {
            aux = false;
        }
        return aux;
    }
    public Boolean verificaUpDate(LocalDateTime dataNova){
        long diferencaEmHoras = ChronoUnit.HOURS.between(this.ultDataTrans, dataNova);
        Boolean aux;
        if (diferencaEmHoras >= 24){
          aux = true;
        } else {
          aux = false;
        }
        return aux;
    }

    public double getLimiteAtual() {
        return limiteAtual;
    }

    public void setLimiteAtual(double limiteAtual) {
        this.limiteAtual = limiteAtual;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getMaxCredito() {
        return maxCredito;
    }

    public void setMaxCredito(double maxCredito) {
        this.maxCredito = maxCredito;
    }

    public int getCodVerificador() {
        return codVerificador;
    }

    public void setCodVerificador(int codVerificador) {
        this.codVerificador = codVerificador;
    }
}
