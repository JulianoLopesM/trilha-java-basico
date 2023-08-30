
//Faça um algoritmo que receba o preço de custo e o preço de venda de 10 produtos. Mostre como resultado
       // se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor
      //  de venda de cada produto, a média de preço de custo e do preço de venda;
import java.util.Scanner;
public class CustoVenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalProdutos = 10;
        int somaCusto = 0;
        int somaVenda = 0;

       for (int i = 1; i <= totalProdutos; i++){
           System.out.println("Produto " + i);
           System.out.println("Digite o preço de custo: ");
           double precoCusto = sc.nextDouble();
           System.out.println("Digite o preço de venda: ");
           double precoVenda = sc.nextDouble();
           somaCusto += precoCusto;
           somaVenda += precoVenda;

           if (precoCusto < precoVenda){
               System.out.println("Lucro");
           } else if (precoCusto > precoVenda) {
               System.out.println("Prejuizo");
           }else {
               System.out.println("Empate");
           }
           System.out.println();

       }
       double mediaCusto = somaCusto/totalProdutos;
       double mediaVenda = somaVenda/totalProdutos;
       System.out.println("Média do preço de custo: " + mediaCusto);
       System.out.println("Médio do preço de venda: " + mediaVenda);
       sc.close();

    }
}
