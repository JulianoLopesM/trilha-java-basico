public class Metodos {
    public static void main(String[] args) {
        //metodos são todas as ações das aplicações
        //Deve ser nomeado como verbo
        //Seguir o padrão camelCase: tudo minusculo menos a primeira letra da segunda palavra;
        //caso o método não retorno nenhum valor, ele será representado pela palavra-chave void.
        //será necessário que o método seja visível a toda aplicação ou somente em mesmo pacotes, através de herença ou somente a nivel a propria classe.
        //
    }
    public double somar(int num1, int num2){
        //logica - finalidade
        return 0;
    }
    public void imprimir(String algumaCoisa){
        //logica - finalidade
        // aqui não precisa do return
        // como não irá retornar nada, precisa do void

    }
    public double dividir(int num3, int num4) throws Exception{
        // o throws serve para indicar que é possivel que haja algum tratamento de erro no método
        // por exemplo, se for pedido para dividir 0 por 0, terá que ser lançada a excessão.
        return 0;
    }
    private void Calcular(){
        //é um método que não pode ser visto por outras classes, apenas nessa.
    }
}
