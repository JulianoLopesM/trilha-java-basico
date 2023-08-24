public class BreakContinue{
        public static void main(String[] args) {

            for(int numero = 1; numero <=5; numero ++){
                if(numero==3)
                    break;

                System.out.println(numero);

            }
            //Qual a saída no console ? utilizando o break, na hora que o numero for igual a 3, ele irá quebrar o loop,
            //imprimindo assim somente o 1 e 2

            for(int numero = 1; numero <=5; numero ++){
                if(numero==3)
                    continue;

                System.out.println(numero);

            }
            //Qual a saída no console ? já o continue, só irá interromper a iteração quando atual estabelecida, ou seja,
            // ele não irá imprimir o numero 3, porem diferente do break, ele irá continuar para o 4 e o 5

        }
}
