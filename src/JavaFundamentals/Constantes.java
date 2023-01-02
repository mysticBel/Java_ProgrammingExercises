package JavaFundamentals;

public class Constantes {
    public static void main(String[] args) {
        //Constante es un dato cuyo valor no cambia durante la
        //ejecucion del programa.
        /* Definimos constantes para asignar valores que no van a
         * ser modificados, por ejem : el port de una bd
         */

        final float pi, e;
        pi = 3.1415f ; //Asignamos 1 sola vez
        e = 8.9f;
        System.out.println(pi);

        //pi = 3.1416f;  --sale error
    }

}
