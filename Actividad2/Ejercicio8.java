import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String Color;
        Double Total=0.0;
        System.out.print("Digite el color de la bola: ");
        Color=scanner.next();
        System.out.print("Digite el valor de la compra: ");
        Total=scanner.nextDouble();
        if (Color.equals("roja")){
            Total=Total*0;}
        else if (Color.equals("azul")){
            Total=Total*0.5;}
        else if (Color.equals("amarilla")){
            Total=Total*0.75;}
        else if (Color.equals("verde")){
            Total=Total*0.9;}
        System.out.println("El cliente debe pagar "+Total);
        scanner.close();
    }
}
