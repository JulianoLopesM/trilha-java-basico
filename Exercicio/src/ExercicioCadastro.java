/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
*/

public class ExercicioCadastro {
    public static void main(String[] args) {
        String nome = "Juliano Lopes";
        String endereco = "Papa João XXIII";
        float salario = 1600.03f;
        String dataRecebimentoSalario = "16/12/2024";
        String relatório = "Eu " + nome + " ,morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data de " + dataRecebimentoSalario;
        System.out.println(relatório);

    }
}
