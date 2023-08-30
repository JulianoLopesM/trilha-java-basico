//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
       // um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
      //  desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
      //  sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
      //  Informar total de carros com ano até 2000 e total geral;

import java.util.Scanner;

public class CarangoVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int totalCarros2000 = 0;
       int totalCarros = 0;
       String resposta = "S";
       while (resposta.equalsIgnoreCase("S")){
           System.out.println("Digite o ano do veiculo: ");
           int ano = sc.nextInt();
           System.out.println("Digite o valor do veiculo: ");
           double valor = sc.nextDouble();
           double desconto;
           if (ano <= 2000){
               desconto = valor * 0.12;
               totalCarros2000++;
           } else  {
               desconto = valor * 0.07;
               totalCarros++;
           }
           double valorFinal = valor - desconto;
           System.out.println("Desconto: R$ " + desconto);
           System.out.println("Valor final: R$ " + valorFinal);

           System.out.println("Deseja continuar calculando o desconto? S/N");
           resposta = sc.next();
       }
        System.out.println("Total de carros até 2000: " + totalCarros2000);
        System.out.println("Total geral de carros: " + totalCarros);
        sc.close();
    }
}
