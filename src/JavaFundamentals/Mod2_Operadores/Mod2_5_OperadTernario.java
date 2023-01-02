package JavaFundamentals.Mod2_Operadores;

public class Mod2_5_OperadTernario {
    public static void main(String[] args) {
        //  Operador Ternario
        // IFTTT : if This, Then That
        /* expresion1 ? expresion2 : expresion3
         * Si expresion 1 = true, then expresion2
         * Si expresion 1 = false, then expresion3
         */

        String mensaje=10 >90? "Es mayor" : "Es menor";
        int enteros= true ? 1 : 0;

        System.out.println(mensaje);
        System.out.println(enteros);

    }
}
