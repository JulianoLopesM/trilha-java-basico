import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        if (ehPrimo(numero)){
            System.out.println(numero + " é um numero primo");
        }else
            System.out.println(numero + " não é um numero primo");

    }
    public static boolean ehPrimo(int num){
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
