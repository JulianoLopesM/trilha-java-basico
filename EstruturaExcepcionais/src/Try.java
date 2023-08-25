import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner((System.in)).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite seu altura");
            double altura = scanner.nextDouble();

            System.out.println("olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
        //alguns problemas que poderiam acontecer, não informar nome e sobrenome, o valor da idade não ser um caractere
        //o valor da altura ter uma virgula ao inves de um ponto.


        //erro é algo irreparavel, a aplicação irá travar e ser encerrada, porém,
        //uma exceção é um fluxo inesperado de nossa aplicação, por exemplo, querer dividir
        //um valor por zero ou por uma senha inválida, estes não são erros, mas sim fluxos não previstos.

    }
}