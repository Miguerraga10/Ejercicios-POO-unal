import java.util.Scanner;
import static java.lang.Math.PI;
public class Ejercicio5 {
    public static void main(String[] args){
        double radio = 0;
        double Area = 0;
        double Longitud = 0;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite el radio del circulo");
        radio = entrada.nextDouble();
        entrada.close();
        Longitud=2*radio*PI;
        Area= PI*(radio*radio);
        System.out.println("El area del circulo de radio "+radio+" es "+ Area);
        System.out.println("La longitud del circulo de radio "+radio+ " es "+Longitud );
    }
}