import java.util.Scanner;
import java.lang.Math;
public class Ejercicio3 {
    public static void main(String[] args){
        double L1,L2,L3, Perimetro, Area, Semiperimetro; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite la longitud del lado 1 del triangulo: ");
        L1=scanner.nextDouble();
        System.out.print("Digite la longitud del lado 2 del triangulo: ");
        L2=scanner.nextDouble();
        System.out.print("Digite la longitud del lado 3 del triangulo: ");
        L3=scanner.nextDouble();
        Perimetro= L1+L2+L3;
        Semiperimetro= Perimetro/2;
        Area= Math.sqrt(Semiperimetro*(Semiperimetro-L1)*(Semiperimetro-L2)*(Semiperimetro-L3));
        System.out.println("El perimetro del triangulo es "+ Perimetro);
        System.out.println("El Semiperimetro del triangulo es "+ Semiperimetro);
        System.out.println("El area del triangulo es "+ Area);
        scanner.close(); 
    }
}
