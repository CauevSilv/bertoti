package test.java;

import Contas.Operacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class teste {
    @Test
    void testeDepositar(){
        double valor1 = 200;
        Operacao op  = new Operacao(200);
        op.depositar(valor1);
        Assertions.assertEquals(200,op.verSaldo());
        //Fail
    }

    @Test
    void testeDepositarB(){
        double valor = 500;
        Operacao op = new Operacao(1000);
        op.depositar(valor);
        Assertions.assertEquals(1500,op.verSaldo());
        //Pass
    }
    @Test
    void testeTransferir(){
        Operacao op = new Operacao(1000);
        op.transferir(15,"Cauê");
        Assertions.assertEquals(985,op.verSaldo());
        //Pass
    }
    @Test
    void testeSacar(){
        Operacao op = new Operacao(500);
        op.sacar(700);
        Assertions.assertEquals(300,op.verSaldo());
        //Fail
    }
    @Test
    void testeTransferirB(){
        Operacao op  = new Operacao(10000);
        op.transferir(9999,"Serasa");
        Assertions.assertEquals(1,op.verSaldo());
    }
    @Test
    void testePagar(){
        Operacao op = new Operacao(7500);
        op.pagar(3000);
        Assertions.assertEquals(300,op.verSaldo());
    }

}
