import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        double Numero = 0;
        double Cuadrado_Numero = 0;
        double Cubo_Numero = 0;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite un número: ");
        Numero = entrada.nextDouble();
        entrada.close();
        Cuadrado_Numero =Numero*Numero;
        Cubo_Numero =Cuadrado_Numero*Numero;
        System.out.println("El cuadrado del número "+Numero+" es: " + Cuadrado_Numero );
        System.out.println("El cubo del número "+Numero+" es: " + Cubo_Numero);
    }
}