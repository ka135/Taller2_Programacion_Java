import java.util.Scanner;

public class Tiempodeviaje {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalMinutos = 0;
        int tramo = 1;

        while (true) {
            System.out.print("Ingresa el tiempo del tramo " + tramo + " en minutos (0 para terminar)");
            int tiempoTramo = sc.nextInt();

            if (tiempoTramo == 0) {
                break;
            }

            totalMinutos += tiempoTramo;
            tramo++;
        }

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("El tiempo total del viaje es: " + horas + ":" + minutos);
    }
}
