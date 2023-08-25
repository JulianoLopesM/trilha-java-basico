public class FormatadorCpf {
    public static void main(String[] args) {
        try {
            String cpfFormatado = formatarCpf("12236648899");
            System.out.println(cpfFormatado);
        } catch (CpfInvalidoException e) {
            System.out.println("o cpf deve ter 11 digitos");
        }

    }
    static String formatarCpf(String cpf ) throws CpfInvalidoException{
        if (cpf.length() != 11)
            throw new CpfInvalidoException();
        String cpfFormatado = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" +
                cpf.substring(9,11);
        return cpfFormatado;

    }
}
