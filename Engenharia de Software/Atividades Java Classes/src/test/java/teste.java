package test.java;

import Contas.Cliente;
import Contas.Operacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class teste {
    @Test
    void testeCpfa(){
        int aux = 0;
        try {
            Cliente cliente = new Cliente(200,"Cauê","111111111","BB",10000);
            //Fail
        } catch (IllegalArgumentException e){
            System.out.println("CPF inválido!");
            aux = 1;
        }
        Assertions.assertEquals(1,aux);

    }
    @Test
    void testCpfb(){
        Cliente cliente = null;
        try{
            cliente = new Cliente(200,"Cauê","11111111111","BB",1000);
        }catch (IllegalArgumentException e){
            System.out.println("CPF inválido");
            Assertions.fail();
            //Pass
        } finally {
            Assertions.assertEquals("11111111111", cliente.getCpf());
        }
    }

    @Test
    void testeLimiteA(){
        double valor = 15;
        Cliente cliente = new Cliente(100,"Cauê","11111111111","BB",10);
        Operacao op = new Operacao();
        op.sacar(cliente,valor);
        Assertions.assertEquals(85,cliente.getSaldo());
        //Fail Limite
    }
    @Test
    void testeLimiteB(){
        double valor = 200;
        Cliente cliente = new Cliente(1500,"Cauê","11111111111","BB",700);
        Operacao op = new Operacao();
        op.sacar(cliente,valor);
        Assertions.assertEquals(184,cliente.getSaldo());
        //Pass
    }
    @Test
    void testeTransferirA(){
        Cliente cliente = new Cliente(1000,"Cauê","11111111111","BB",1000);
        Operacao op  = new Operacao();
        op.transferir(cliente,15,"Banco");
        Assertions.assertEquals(985,cliente.getSaldo());
        //Pass
    }
    @Test
    void testeTransferirB(){
        Cliente cliente = new Cliente(9999,"Cauê","11111111111","BB",10000);
        Operacao op  = new Operacao();
        op.transferir(cliente,9998,"Serasa");
        Assertions.assertEquals(1,cliente.getSaldo());
    }
    @Test
    void testeSacarA(){
        Cliente cliente = new Cliente(1000,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.sacar(cliente,700);
        Assertions.assertEquals(900,cliente.getSaldo());
        //Fail
    }
    @Test
    void testeSacarB(){
        Cliente cliente = new Cliente(1000,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.sacar(cliente,700);
        Assertions.assertEquals(300,cliente.getSaldo());
        //Fail
    }

    @Test
    void testePagar(){
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.pagar(cliente,3000);
        Assertions.assertEquals(300,cliente.getSaldo());
    }
    @Test
    void testePagarB(){
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.pagar(cliente,150);
        Assertions.assertEquals(300,cliente.getSaldo());
    }
    @Test
    void testeDepositarA(){
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.depositar(cliente,1005);
        Assertions.assertEquals(300,cliente.getSaldo());
    }
    @Test
    void testeDepositarB(){
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.depositar(cliente,150);
        Assertions.assertEquals(350,cliente.getSaldo());
    }

}
