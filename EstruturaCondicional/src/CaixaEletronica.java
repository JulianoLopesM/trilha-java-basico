public class CaixaEletronica {
    public static void main(String[] args) {
     double saldo = 25.0;
     double valorSolicitado = 17.0;

     if (valorSolicitado<saldo)// se essa condição for verdadeira, a linha de baixo será ativada.
         saldo = saldo - valorSolicitado;
        System.out.println(saldo);
        //este foi o exemplo de uma condional simples.
    }
}

