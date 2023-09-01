package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno juliano = new Aluno();
        juliano.setNome("Juliano Lopes");
        juliano.setIdade(18);
        System.out.println("o aluno " + juliano.getNome() + " tem " + juliano.getIdade() + " anos");

    }

}
