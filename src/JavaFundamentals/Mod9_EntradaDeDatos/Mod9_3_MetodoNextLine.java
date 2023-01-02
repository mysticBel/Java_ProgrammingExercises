package JavaFundamentals.Mod9_EntradaDeDatos;

import java.util.Scanner;

public class Mod9_3_MetodoNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        String name = sc.nextLine();

        System.out.println("¿Cual es tu edad?");
        int age =  sc.nextInt();
        sc.nextLine();  //captura el salto de linea de nextInt

        System.out.println("¿Sabes hacer trucos de magia? (si/no)");
        //boolean value=  sc.nextBoolean();
        boolean value=  sc.nextLine().equals("si");

        //Imprimimos
        System.out.println("DATA");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Magic Tricks : " + value);

        sc.close(); //buena practica para optimixar recursos
    }
}
