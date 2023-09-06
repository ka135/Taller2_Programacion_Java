import java.util.Scanner;

public class computadoradivina {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Piensa en número del 1 al 100");
        System.out.println("Ingresa '<' si es menor, '>' si es mayor, o '=' si es correcto");
        int minNum = 1;
        int maxNum = 100;
        int intentos = 0;

        while (true) {
            int intento = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
            intentos++;
            System.out.print("¿Es " + intento + " tu número?");
            String respuesta = sc.next();

            if (respuesta.equals("<")) {
                maxNum = intento - 1;
            } else if (respuesta.equals(">")) {
                minNum = intento + 1;
            } else if (respuesta.equals("=")) {
                System.out.println("Adiviné el número " + intento + " en " + intentos + " intentos");
                break;
            } else {
                System.out.println("Solo puedes ingresa '<', '>', o '='");
            }
        }
        sc.close();
    }
}


