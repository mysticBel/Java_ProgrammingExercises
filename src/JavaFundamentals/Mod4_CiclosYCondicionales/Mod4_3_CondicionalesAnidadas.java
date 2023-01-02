package JavaFundamentals.Mod4_CiclosYCondicionales;

public class Mod4_3_CondicionalesAnidadas {
    public static void main(String[] args) {
        // Condicionales Anidados
        int nota = 9;

        if (nota >= 7) {
            //nota aprobada
            if (nota == 10) {
                System.out.println("Muchas Felicidades");
            }else{
                System.out.println("Felicidades");
            }
        } else {
            //nota deprobada
            System.out.println("Es necesario repasar más.");
        }
    }
}
