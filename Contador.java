import java.util.Scanner;

    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
    public class Contador {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro número");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo número");
            int num2 = scanner.nextInt();
            try {
                contar(num1,num2);
            }catch (ParametrosInvalidosException e){
                System.out.println(e.getMessage());
            }
        }

        static void contar(int num1, int num2) throws ParametrosInvalidosException{
            if(num1 > num2){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            int contagem = num2 - num1;
            for (int i = 1; i < contagem; i++){
                System.out.println("Imprimindo o número "+ i);
            }
        }
    }

