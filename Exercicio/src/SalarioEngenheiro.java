//A empresa da Vale faz o pagamento de seus engenheiros por salario minimo * horas diarias. Faça um algoritmo que
// calcule e exiba o salário de um engenheiro. Sabe-se que o valor do salario seguindo a tabela abaixo:
//a. Engenheiro 1 6 horas diarias = 6 salarios minimos;
//b. Engenheiro 2 7 horas diarias = 7 salarios minimos;
//c. Engenheiro 3 8 horas diarias = 8 salarios minimos;
import java.util.Scanner;
public class SalarioEngenheiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escolha o tipo de engenheiro ");
        System.out.println("1. engenheiro nível 1");
        System.out.println("2. engenheiro nível 2");
        System.out.println("3. engenheiro nível 3");
        int nivel = sc.nextInt();

        double valorHoras = 0;
        double salarioMinimo = 1320;
        switch (nivel){
            case 1:
                valorHoras = 6;
                break;
            case 2:
                valorHoras = 7;
                break;
            case 3:
                valorHoras = 8;
                break;
            default:
                System.out.println("Nivel não existente");
                sc.close();
                return;
        }
        double salario = valorHoras * salarioMinimo;
        System.out.println("O salario desse engenheiro será de " + salario);
        sc.close();
    }
}
