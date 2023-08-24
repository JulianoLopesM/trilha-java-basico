public class NotaEscolar2 {
    public static void main(String[] args) {
        float nota = 8;
        if (nota >= 7){
            System.out.println("Parabéns, aprovado!");
        } else if (nota >= 5 && nota < 7) {//é chamado de condição encadeada.
            System.out.println("Está de recuperação!");
        }else
            System.out.println("Reprovado");

    }
}
