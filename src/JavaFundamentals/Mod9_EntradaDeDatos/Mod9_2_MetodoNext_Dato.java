package JavaFundamentals.Mod9_EntradaDeDatos;

import java.util.Scanner;

public class Mod9_2_MetodoNext_Dato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        String name = sc.nextLine();

        System.out.println("¿Cual es tu edad?");
       //  String age = sc.nextLine(); -- Porque es Int , no String
        int age =  sc.nextInt(); // Integer.parseInt(sc.nextLine());

        System.out.println("¿Cual es tu altura?");
        float height = sc.nextFloat();

        System.out.println("¿Te gustan las scoobygalletas?");
        boolean value= sc.nextBoolean();

        //Imprimimos
        System.out.println("DATOS PERSONALES");
        System.out.println("Nombre : " + name);
        System.out.println("Edad : " + age);
        System.out.println("Altura : " + height);
        System.out.println("Scoobygalletas : " + value);
    }
}
