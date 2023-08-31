import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double A, B, C, Mayor;
        System.out.print("Ingrese el valor de la variable A: ");
        A = scanner.nextDouble();
        System.out.print("Ingrese el valor de la variable B: ");
        B = scanner.nextDouble();
        System.out.print("Ingrese el valor de la variable C: ");
        C = scanner.nextDouble();
        Mayor = A;
        if (B>Mayor){
            Mayor = B;}
        if (C>Mayor){
            Mayor = C;}
        System.out.println("El numero mayor es el "+ Mayor);
        scanner.close();
    }
}
