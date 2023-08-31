import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Double A,B;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite el valor de A: ");
        A= scanner.nextDouble();
        System.out.print("Digite el valor de B: ");
        B= scanner.nextDouble();
        if (A>B) 
            System.out.println(A+" es mayor a "+B);
        else if (A<B)
            System.out.println(A+" es menor a "+B);
        else
            System.out.println(A+" es igual a "+B);
        scanner.close();
    }
}
