package JavaFundamentals;

public class Mod2_4_OperadLogicos {
    public static void main(String[] args) {
        // Operadores Logicos
        // and (Y),  or (o) y not( no)

        boolean resultado;

        resultado = 5 >= 5 && true && 10 > 9;
        System.out.println(resultado);

        resultado = false || false || false || true ;
        System.out.println(resultado);

        resultado = (5 >= (2*3) || true) && (true && 10 > 5);
        System.out.println(resultado);

        // Operador Logico NOT
        System.out.println(" ");
        System.out.println(!true);
        System.out.println(!false);
    }

}
