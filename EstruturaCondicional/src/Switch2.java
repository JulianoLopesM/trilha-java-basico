public class Switch2 {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano){
            case "T":{
                System.out.println(" 5gb de youtube");
            }
            case "M":{
                System.out.println("Whatsapp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação ");
            }
        }
        //este é exemplo de switch é melhor para se usar no lugar do if, pois economiza linhas e se torna mais estético
        // o nosso código.


    }
}
