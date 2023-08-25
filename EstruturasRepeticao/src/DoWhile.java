import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("telefone tocando");
        } while (tocando());
        System.out.println("Alô");


    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu?" + atendeu);

        return !atendeu;
    }
    // o laço do/while, assim como o laço while, considera que, enquanto uma determinada condição for válida, o bloco
    // de codigo será executado. Entretanto, do/while testa a condição apos executar o código, sendo assim , mesmo
    // que a condição seja considerada inválida, no primeiro teste o bloco será executado pelo menos uma vez.
    // estrutura
    // do{
    //    //comando que será executado até que a expressão de validação torne-se falsa
    // }
    // while (expressão booleana de validação);
}
