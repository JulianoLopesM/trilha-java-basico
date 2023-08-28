import java.util.Scanner;

public class ConversorFToC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o tipo de conversão");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = sc.nextInt();

        if (escolha == 1){
            System.out.println("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °2F");


        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperatura em Celsius: " + celsius + " °C");

        }else
            System.out.println("Opção inválida!");
        sc.close();

    }

    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
