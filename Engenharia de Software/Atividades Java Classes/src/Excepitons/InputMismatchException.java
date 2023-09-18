package Excepitons;

public class InputMismatchException extends RuntimeException{
        private String mensagem;
        public InputMismatchException(String mensagem) {
            this.mensagem = "String informada no input errado!" + mensagem;
        }

        @Override
        public String getMessage() {
            return this.mensagem;
        }
    }


