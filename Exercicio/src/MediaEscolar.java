

//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
       // sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
        //Recuperação (media entre 5.1 a 6.9);
import java.util.InputMismatchException;
import java.util.Scanner;
public class MediaEscolar {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = sc.nextDouble();
        double mediaNota = (nota1+nota2+nota3)/3;

        if (mediaNota >= 7) {
            System.out.println(nome + " ,parabéns, aprovado com a nota: " + mediaNota);
        } else if (5.1 <=  mediaNota || mediaNota <= 6.9 ) {
            System.out.println(nome + ", você está de recuperação, pois ficou com a nota: " + mediaNota);
        }else
            System.out.println(nome + ", você está reprovado, pois ficou com a nota: " + mediaNota);
        sc.close();


    }catch (InputMismatchException e){
            System.out.println("Digite com virgula");
        }
    }
}
