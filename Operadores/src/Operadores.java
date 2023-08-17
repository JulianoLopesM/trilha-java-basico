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
        //System.out.println(- numero);
        //numero = numero * -1 ; assim transformo do negativo para o positivo.
        //numero = numero + 2;//incrementando em + 2
        numero--;
        System.out.println(numero);

        boolean variavel = true;
        variavel = !variavel;//inverti o valor lógico de true para false
        System.out.println(variavel);

        //operador ternario, é uma forma resumida para definir uma condição e escolher por um
        //dentre dois valores. é representado pelos símbolos ?:
        int a,b;
        a = 6;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //operadores relacionais avaliam a relação entre duas variáveis ou expressões;
        //utilizando os simbolos:;
        // == para identificar se uma variavel é igual a outra;
        // != para identificar se uma variavel é diferente da outra;
        // > para identificar se uma variavel é maior que a outra;
        // >= para identificar se uma variavel é maior ou igual a outra;
        // < para identificar se uma variavel é menor que a outra;
        // <= para identificar se uma variavel é menor ou igual a outra;

        int numeroUm = 3;
        int numeroDois = 4;

        boolean simNao = numeroUm > numeroDois;
        System.out.println("o numeroUm é maior do que o numeroDois? " + simNao);

        simNao = numeroUm < numeroDois;
        System.out.println("o numeroUm é menor do que o numeroDois? " + simNao);

        simNao = numeroUm != numeroDois;
        System.out.println("o numeroUm é diferente do numeroDois? " + simNao);

        //operadores lógicos, representam o recurso que nos permite criar expressçoes lógicas maiores;
        //%% significa "e"
        //|| significa "Ou"

        boolean condição1 = true;
        boolean condição2 = false;
        if (condição1 && condição2){
            System.out.println("as duas condições são verdadeiras");
        }
        if (condição1 || condição2 ){
            System.out.println("umas das duas é verdadeira");
        }
        System.out.println("acabou.");



    }
}
