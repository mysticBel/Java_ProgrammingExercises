package JavaFundamentals.Mod9_EntradaDeDatos;
 import java.util.Scanner;   //importamos de package util

public class Mod9_1_ClaseScanner {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);        //Creamos la instancia, recibe como argumento System.in
      System.out.println("¿Cual es tu nombre?");  //Preguntamos

      //Declaramos y asignamos el dato ingresado en consola
      //con el metodo de Scanner : nextLine()
      String name = sc.nextLine();
      System.out.println("¿Cual es tu edad?");
      String age = sc.nextLine();

       System.out.println("Hola "+ name +", tienes "+ age +" años.");           // Saldra el saludo
 }
}
