package test.java;

import Contas.Cliente;
import Contas.Operacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class teste {
    @Test
    void testeLogin(){
        try {
            Cliente cliente = new Cliente(200,"Cauê","11111111111","BB");
            Operacao op = new Operacao();
            double valor1 = 200;
            op.depositar(cliente,valor1);
            Assertions.assertEquals(200,cliente.getSaldo());
            //Fail
        } catch (IllegalArgumentException e){
            System.out.println("CPF inválido!");
            Assertions.fail();
        }
    }
    @Test
    void testLoginB(){
        try{
            Operacao op = new Operacao();
            Cliente cliente = new Cliente(200,"Cauê","11111111111","BB");
            Assertions.assertEquals(1000,cliente.getSaldo());
        }catch (IllegalArgumentException e){
            System.out.println("CPF inválido");
            Assertions.fail();
        }
    }

    @Test
    void testeDepositarB(){
        double valor = 500;
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB");
        Operacao op = new Operacao();
        op.depositar(cliente,valor);
        Assertions.assertEquals(1500,cliente.getSaldo());
        //Pass
    }
    @Test
    void testeTransferir(){
        Cliente cliente = new Cliente(1000,"Cauê","11111111111","BB");
        Operacao op  = new Operacao();
        op.transferir(cliente,15,"Banco");
        Assertions.assertEquals(985,cliente.getSaldo());
        //Pass
    }
    @Test
    void testeSacar(){
        Cliente cliente = new Cliente(1000,"Cauê","11111111111","BB");
        Operacao op = new Operacao();
        op.sacar(cliente,700);
        Assertions.assertEquals(900,cliente.getSaldo());
        //Fail
    }
    @Test
    void testeTransferirB(){
        Cliente cliente = new Cliente(150,"Cauê","11111111111","BB");
        Operacao op  = new Operacao();
        op.transferir(cliente,9999,"Serasa");
        Assertions.assertEquals(1,cliente.getSaldo());
    }
    @Test
    void testePagar(){
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB");
        Operacao op = new Operacao();
        op.pagar(cliente,3000);
        Assertions.assertEquals(300,cliente.getSaldo());
    }

}
