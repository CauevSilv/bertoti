package test.java;

import Contas.Cliente;
import Contas.Operacao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class teste {
    @Test
    void testeLogin(){
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
    void testLoginB(){
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
    void testeDepositarA(){
        double valor = 500;
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.depositar(cliente,valor);
        Assertions.assertEquals(1500,cliente.getSaldo());
        //Pass
    }
    @Test
    void testeTransferir(){
        Cliente cliente = new Cliente(1000,"Cauê","11111111111","BB",1000);
        Operacao op  = new Operacao();
        op.transferir(cliente,15,"Banco");
        Assertions.assertEquals(985,cliente.getSaldo());
        //Pass
    }
    @Test
    void testeSacar(){
        Cliente cliente = new Cliente(1000,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.sacar(cliente,700);
        Assertions.assertEquals(900,cliente.getSaldo());
        //Fail
    }
    @Test
    void testeTransferirB(){
        Cliente cliente = new Cliente(150,"Cauê","11111111111","BB",1000);
        Operacao op  = new Operacao();
        op.transferir(cliente,9999,"Serasa");
        Assertions.assertEquals(1,cliente.getSaldo());
    }
    @Test
    void testePagar(){
        Cliente cliente = new Cliente(200,"Cauê","11111111111","BB",1000);
        Operacao op = new Operacao();
        op.pagar(cliente,3000);
        Assertions.assertEquals(300,cliente.getSaldo());
    }

}
