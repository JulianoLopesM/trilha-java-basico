public class Switch {
    public static void main(String[] args) {
        String sigla = "T";
        switch (sigla){
            case "P":{
                System.out.println("pedra");
                break;
            }
            case "M":{
                System.out.println("mão");
                break;
            }
            case "T":{
                System.out.println("tesoura");
                break;
            }
            default:
                System.out.println("não foi inserido uma sigla");

        }
    }
}
