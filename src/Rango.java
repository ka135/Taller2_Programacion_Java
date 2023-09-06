import java.util.Scanner;

public class Rango {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double min=0,max=0, res;
        System.out.println("Cuantos datos desea ingresar");
        int n=sc.nextInt();
        double [] a = new double [n];
        for (int i = 0; i < a.length; i++){
            System.out.println("Valor:"+(i + 1));
            a[i]=sc.nextDouble();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        res=max-min;
        System.out.println("El rango es "+ res);
    }
}
