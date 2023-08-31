import java.util.Scanner;
import java.lang.Math;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double Peso1, Peso2, Peso3, Minimo, Maximo, Diferente;
        String Dif;
        System.out.print("Digite el peso de la esfera 1: ");
        Peso1 = scanner.nextDouble();
        System.out.print("Digite el peso de la esfera 2: ");
        Peso2 = scanner.nextDouble();
        System.out.print("Digite el peso de la esfera 3: ");
        Peso3=scanner.nextDouble();
        Minimo=Math.min(Math.min(Peso1, Peso2),Peso3);
        Maximo=Math.max(Math.max(Peso1, Peso2),Peso3);
        if (((Maximo!=Peso1)&&(Maximo!=Peso2))||((Maximo!=Peso1)&&(Maximo!=Peso3)||((Maximo!=Peso2)&&(Maximo!=Peso3)))){
            Diferente=Maximo;}
        else {
            Diferente=Minimo;}
        if (Diferente==Peso1){
            Dif="A";}
        else if (Diferente==Peso2){
            Dif="B";}
        else {
            Dif="C";}
        if (Diferente==Minimo){
            System.out.println("La esfera diferente es la esfera "+Dif+" y es menor que las otras tres.");}
        else {
            System.out.println("La esfera diferente es la esfera "+Dif+" y es mayor que las otras tres.");}
        scanner.close();
    }
}