package test.java;

import Contas.Operacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class teste {
    @Test
    void testeLogin(){
        try {
            Operacao op = new Operacao(200, "Cauê", "8888888");
            double valor1 = 200;
            op.depositar(valor1);
            Assertions.assertEquals(200,op.getSaldo());
            //Fail
        } catch (IllegalArgumentException e){
            System.out.println("CPF inválido!");
            Assertions.fail();
        }
    }
    @Test
    void testLoginB(){
        try{
            Operacao op = new Operacao(1000,"Cauê","11111111111");
            Assertions.assertEquals(1000,op.getSaldo());
        }catch (IllegalArgumentException e){
            System.out.println("CPF inválido");
            Assertions.fail();
        }
    }

    @Test
    void testeDepositarB(){
        double valor = 500;
        Operacao op = new Operacao(1000,"Caue","88888888");
        op.depositar(valor);
        Assertions.assertEquals(1500,op.getSaldo());
        //Pass
    }
    @Test
    void testeTransferir(){
        Operacao op = new Operacao(1000,"Caue","88888888");
        op.transferir(15,"Banco");
        Assertions.assertEquals(985,op.getSaldo());
        //Pass
    }
    @Test
    void testeSacar(){
        Operacao op = new Operacao(500,"Caue","88888888");
        op.sacar(700);
        Assertions.assertEquals(300,op.getSaldo());
        //Fail
    }
    @Test
    void testeTransferirB(){
        Operacao op  = new Operacao(10000,"Caue","88888888");
        op.transferir(9999,"Serasa");
        Assertions.assertEquals(1,op.getSaldo());
    }
    @Test
    void testePagar(){
        Operacao op = new Operacao(7500,"Caue","88888888");
        op.pagar(3000);
        Assertions.assertEquals(300,op.getSaldo());
    }

}
