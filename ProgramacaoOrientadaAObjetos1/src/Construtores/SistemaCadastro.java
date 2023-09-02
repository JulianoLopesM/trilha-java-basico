package Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("marcos", "09239523489");

        //definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        //e como definir o nome e cpf do marcos ?
        //definimos o nome e cpf como parametro no objeto pessoa criado.

        //imprimindo o marcos com o nome e cpf

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
