package Junit.metodosTeste;

import Junit.Teste;
import org.junit.Test;

public class Testador {
    @Test
    public static void main(String[] args) {
        Teste teste = new Teste();
        double saldoFinal = teste.test(1000,1,200);
        
    }
    //TIPO DE OPERAÇÕES
    // 1|Sacar     - 2|Ver Saldo(Coloque qualquer valor na opreação)
    // 3|Depositar - 4|Transferir - 5|Pagar


}
