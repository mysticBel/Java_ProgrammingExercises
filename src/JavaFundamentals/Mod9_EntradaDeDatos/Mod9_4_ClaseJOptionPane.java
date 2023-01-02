package JavaFundamentals.Mod9_EntradaDeDatos;
import javax.swing.*;

public class Mod9_4_ClaseJOptionPane {
    public static void main(String[] args) {
        //Instanciamos el metodo showInputDialog
        String name= JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual es tu edad?"));

        //Agregamos un bonito msj con showMessageDialog
        String welcomeMsg = "Hola "+name+ " , tu edad es "+ age+" años";
        JOptionPane.showMessageDialog(null,welcomeMsg);
    }
}
