import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        //O laço while determina que, enquanto uma condição for válida , o bloco de código será executado.
        //O laço while, testa a condição antes de executar o código, logo, caso a condição seja inválida no
        // primeiro teste o bloco nem será executado.
        // estrutura
        // while (expressão booleana de validação){
        //   comando que será executado até que a expressão de validação seja falsa.
        // }

        double mesada = 50;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " Adicionando no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    //assim que o valor dos doces bater os 50 reais da mesada, joao terá sua mesada zerada e comprará tudo em doces.
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);// os valores dos doces serão entre 2 a 8 reais
    }
}
