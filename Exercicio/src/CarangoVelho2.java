//A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um
  //      algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser
    //    calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel
      //  –14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos
        //clientes;

import java.util.Scanner;

public class CarangoVelho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "S";
        double totalDesconto = 0;// o totalDesconto foi criado para acumular o desconto do "desconto" que acontecem
        // dentro do meu while
        double totalPago = 0;// o totalPago foi criado para acumular os valores finais que acontecem dentro do meu while
        while (resposta.equalsIgnoreCase("S")){//o comando equalsIgnoreCase significa que ele aceita tanto
            //letras minusculas quanto maisculas
            System.out.println("Digite o valor do veiculo");
            double valorVeiculo = sc.nextDouble();
            System.out.println("Selecione o tipo de combustivel: ");
            System.out.println("1. Álcool");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            int Combustivel = sc.nextInt();

            double desconto = 0;
            switch (Combustivel){
                case 1:
                    desconto = valorVeiculo * 0.25;
                    break;
                case 2:
                    desconto = valorVeiculo * 0.21;
                    break;
                case 3:
                    desconto = valorVeiculo * 0.14;
                    break;
            }
            double valorFinal = valorVeiculo - desconto;
            totalDesconto += desconto;//a cada iteração, o valor de desconto será adicionado dentro de totalDesconto.
            totalPago += valorFinal;// a cada iteração, o valorFinal será adicionado dentro de totalPago.
            //ou seja, são duas variaveis acumuladores que permitem no final do meu código mostrar o total de desconto
            // concedido e o total de valor pago no final

            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor final a ser pago: R$ " + valorFinal);

            System.out.println("Deseja continuar calculando o desconto? S/N");
            resposta = sc.next();

        }
        System.out.println("Total de desconto concedido: R$ " + totalDesconto);
        System.out.println("Total pago pelos clientes: R$ " + totalPago);

        sc.close();


    }
}
