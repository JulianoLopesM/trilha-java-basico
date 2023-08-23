

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();

        System.out.println("Digite o numero da agência!");
        String agencia = sc.next();
        sc.nextLine();//se eu nao colocar isso  o digite o seu nome vai aparecer junto com o digite o seu saldo

        System.out.println("Digite o seu nome");
        String nome = sc.nextLine();

        System.out.println("digite seu saldo");
        float saldo = sc.nextFloat();

        System.out.println("olá " + nome + " ,obrigado pro criar uma conta em nosso banco, sua agência é a " + agencia +
                " ,conta " + numero + " e seu saldo de " + saldo + " reais já está disponivel para saque! ");

    }
}