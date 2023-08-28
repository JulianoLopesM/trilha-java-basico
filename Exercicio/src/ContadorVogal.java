import java.util.Scanner;

public class ContadorVogal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase");
        String input = sc.nextLine();

        int contadorVogal = contarVogais(input);//chamo a função dando o input como parametro

        System.out.println("Número de vogais na string: " + contadorVogal);

        sc.close();
    }

    public static int contarVogais(String str){
        int contador = 0;//vai contar o numero de vezes que as vogais foram identificadas
        str = str.toLowerCase();//Converte a string para minúsculas usando o método toLowerCase(), para que possamos
        // considerar tanto letras maiúsculas quanto minúsculas como vogais.

        for (int i = 0; i < str.length(); i++){//loop que percorre por cada caractere da frase
            char ch = str.charAt(i);//identifica a vogal e a armazena
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                contador++;
            }
        }
        return contador;
    }
}
