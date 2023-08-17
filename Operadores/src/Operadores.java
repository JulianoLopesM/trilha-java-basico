public class Operadores {
    public static void main (String[] args){

        //operador de atribuição, usa o simbolo =
        // é utilizado para definir o valor inicial ou sobrescrever
        //o valor de uma variável.
        //exemplo
        int idade = 22;
        String nome = "Juliano";
        double peso = 78;

        //operador aritimético, é utilizado para realizar operações
        //matemáticas entre valores numericos.
        // + , - , * , /
        double soma = 10 + 5;
        int subtração = 100 - 50;
        int multiplicação = 20 * 7;
        int divisão = 15 / 3;
        int modulo = 18 % 3; // descubro o resto de uma divisão


        // com "+" consigo concatenizar textos.

        String nomeCompleto = "juliano" + " lopes";
        System.out.println(nomeCompleto);

        //operadores unários
        //são aplicados juntamente com um outro operador aritmético.
        // realizam trabalhos como incrementar, decrementar,e inverter valores.
        // (+) Operador unário positivo - números são positivos sem esse operador explicitamente.
        // (-) Operador unário negativo - nega um número ou expressão aritmética.
        // (++) Operador únario de incremento - incrementa o valor em 1 unidade;
        // (==) Operador únario de decremente - decrementa o valor em 1 unidade;
        // (!) operador únario de negação - nega o valor de uma expressão booleana

        int numero = 5;
        //numero = -numero; se eu quiser tornar o numero negativo eu faço isso.
        System.out.println(- numero);
        //numero = numero * -1 ; assim transformo do negativo para o positivo.



    }
}
