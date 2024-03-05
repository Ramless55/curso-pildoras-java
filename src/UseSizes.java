import java.util.Scanner;

public class UseSizes {

    enum Size {
        MINI("S"),
        MEDIANO("M"),
        GRANDE("L"),
        MUY_GRANDE("XL");

        private String abreviatura;

        Size(String abreviatura){
            this.abreviatura = abreviatura;
        }

        public String getAbreviatura(){
            return abreviatura;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

        String entrada_datos = entrada.next().toUpperCase();

        Size size = Enum.valueOf(Size.class, entrada_datos);

        System.out.println("Talla: " + size);

        System.out.println("abreviatura es: " + size.getAbreviatura());
    }
}
