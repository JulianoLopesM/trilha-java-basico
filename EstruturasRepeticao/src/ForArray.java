public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"felipe", "jonas", "julia", "marcos"};
        //for (int x = 0; x < alunos.length; x++){
           // System.out.println("o aluno no indice x= " + x + " é " + alunos[ x ] );
       // }
        // agora uma forma mais abreviada

        for (String aluno : alunos){ //De forma abreviada, é criada uma variável nome obtendo um elemento do vetor a cada ocorrência;
            System.out.println("nome do aluno é " +aluno);

        }

    }
}
// em arrays o indice de elementos se inicia em zero.