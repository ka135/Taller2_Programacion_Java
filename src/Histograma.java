import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        int n;

        System.out.println("Ingrese valores enteros y termina con un 0");
        n = scanner.nextInt();

        while (n != 0) {
            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            }
            n = scanner.nextInt();
        }
        System.out.println("Positivos");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Negativos");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
        scanner.close();
    }
}
