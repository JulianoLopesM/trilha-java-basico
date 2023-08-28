

//A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que
       // calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
        //a. Professor Nível 1 R$12,00 por hora/aula;
        //b. Professor Nível 2 R$17,00 por hora/aula;
        //c. Professor Nível 3 R$25,00 por hora/aula.
import java.util.Scanner;
public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o número de horas: ");
        int horasAula = sc.nextInt();

        System.out.println("Escolha o nível do professor");
        System.out.println("1. professor nível 1");
        System.out.println("2. professor nível 2");
        System.out.println("3. professor nível 3");
        int nivel = sc.nextInt();

        double valorHoraAula = 0;

        switch (nivel){
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("nivel inválido");
                sc.close();
                return;
        }
        double salario = valorHoraAula * horasAula;
        System.out.println("O salário desse professor é " + salario);
        sc.close();
    }
}
