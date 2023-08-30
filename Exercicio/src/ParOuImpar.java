//Exercício: Verificação de Paridade
        //Escreva um programa que recebe um número inteiro e usa um operador ternário
        //para determinar se o número é par ou ímpar.
        //O programa deve imprimir a mensagem "Par" se o número for par e "Ímpar" se o número for ímpar.
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite aqui um numero inteiro: ");
        int num = sc.nextInt();
        String resultado = num%2==0? "Par" :"Impar";
        System.out.println(resultado);
    }
}
    //String resultado = num%2==0? "Par" : num%2==1?  "Impar" : "Numero não inteiro" ;