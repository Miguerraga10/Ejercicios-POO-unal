import java.util.Scanner;
import java.lang.Math;
public class Ejercicio2 {
    public static void main(String[] args){
        double Lado, Altura, Perimetro, Area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el lado del triangulo equilatero: ");
        Lado = scanner.nextDouble();
        Perimetro = 3*Lado;
        Altura = (((Lado*Lado)-((Lado/2)*(Lado/2))));
        Altura = Math.sqrt(Altura);
        Area = Altura*(Lado/2)/2;
        System.out.println("El perimetro del triangulo de lado "+Lado+" es "+ Perimetro);
        System.out.println("La altura del triangulo de lado "+Lado+" es "+ Altura);
        System.out.println("El area del triangulo de lado "+Lado+" es "+ Area);
        scanner.close();
    }
}