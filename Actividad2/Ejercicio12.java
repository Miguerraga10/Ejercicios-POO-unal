import java.util.Scanner;
import java.lang.Math;
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double A, B, C, discr, X1, X2;
        System.out.print("Digite el valor de a: ");
        A = scanner.nextDouble();
        System.out.print("Digite el valor de b: ");
        B = scanner.nextDouble();
        System.out.print("Digite el valor de c: ");
        C = scanner.nextDouble();
        discr = B * B - 4 * A * C;
        if (discr > 0) {
            X1 = (-B + Math.sqrt(discr)) / (2 * A);
            X2 = (-B - Math.sqrt(discr)) / (2 * A);
            System.out.println("Las soluciones son: x1 = " + X1 + " y x2 = " + X2); }
        else if (discr == 0) {
            X1 = -B / (2 * A);
            System.out.println("La solución doble es: x1 = " + X1);}
        else {
            System.out.println("No hay soluciones reales.");}
        scanner.close();
    }
}