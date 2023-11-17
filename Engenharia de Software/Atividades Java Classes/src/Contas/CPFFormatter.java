package Contas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPFFormatter {

    public String formatCPF(String cpf) {
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Define a máscara do CPF
        String pattern = "###.###.###-##";

        // Aplica a máscara usando expressão regular
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(cpf);

        if (m.matches()) {
            // Retorna o CPF formatado
            return m.group(0);
        } else {
            // Se o CPF não corresponder à máscara, retorna o CPF sem formatação
            return cpf;
        }
    }
}
