public class FormatadorCep {
    public static void main (String[]args){
        try {
            String cepFormatado = formatarCep("98765432");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("o cep precisa ter 8 digitos");
        }


    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        String cepFormatado = cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5, 8);


        //simulando um cep formatado
        return cepFormatado;
    }
}
