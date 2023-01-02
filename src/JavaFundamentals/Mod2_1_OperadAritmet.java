package JavaFundamentals;

public class Mod2_1_OperadAritmet {

    public static void main(String[] args) {
        // Operadores Aritmeticos

        int varX = 50, varY = 10;
        int result;

        //Operadores +, -, *, /
        result = varX + varY;
        System.out.println(result);


        //Aumentar o decrecer en 1
        varX++;
        varY--;
        //Aumentar o decrecer en "n" : +=, -=, *=, /=
        varX += 100 ; // varX = varX+100
        System.out.println(varX);

        varY /= 2 ; // varY = varY/5
        System.out.println(varY);

        //Tambien se puede calcular con ASCII
        char letra1= 'a';
        char letra2= 'b';
        System.out.println(letra1+letra2);
    }
}
