package JavaFundamentals.Mod4_CiclosYCondicionales;

public class Mod4_2_CondicionalesIf_ElseIf_else {
    public static void main(String[] args) {
        //
        String colorLuz = "Rosa";

        if(colorLuz.equals("Verde")){
            System.out.println("Puede continuar");
        }else if (colorLuz.equals("Amarillo")) {
            System.out.println("Alto parcial");
        }else if (colorLuz.equals("Rojo")) {
            System.out.println("Alto total");
        }else {
            System.out.println("Color no válido");
        }
    }

}
