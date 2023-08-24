public class For {
    public static void main(String[] args) {
        //O comando for permite que uma variavel contadora, seja testada e incrementada a cada iteração.O Comando for
        // recebe como entrada uma variavel contadora, a condição para continuar a execução e o valor de incrementação.
        //for (bloco de inicialização ; expressão booleana; bloco de atualização{
        //  comando que será executado até que expressão de validação torne-se falsa
        // }
        for (int carneirinho = 1; carneirinho <= 20; carneirinho ++){
            System.out.println("Contando carneirinhos " + carneirinho);
        }
    }
}