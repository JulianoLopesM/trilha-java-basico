public class Tipos {
    public static void main (String[]args){
        //existem 8 tipos primitivos em java, sendo eles : int, byte
        //short,long, float,double , boolean  e char. Isso quer dizer que esses
        // tipos não são considerados objetos, representam valores brutos. são armazenados diretamente na pilha de memoria.

        // tipo > nome da variavel > valor da variavel
        int idade;
        double salario = 2500;
        long cpf = 4276897263L;
        float pi = 3.14f;
        byte hey = 127;

        // Constantes não podem ser modificadas depois de declaradas
        // com a palavra final, eu impeço a minha variavel mudar de valor
        //constantes é sempre declarada em capslock

        final double VALOR_DE_PI = 3.14; //o valor não será alterado.
        //VALOR_DE_PI = 3; // vai dar erro
        System.out.println("love you");


    }

}
