import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int Edad_Juan = 0;
        int Edad_Alberto = 0;
        int Edad_Ana = 0;
        int Edad_Mama = 0;
        System.out.print("Digite la edad de Juan: ");
        Edad_Juan = entrada.nextInt();
        entrada.close();
        Edad_Alberto = Edad_Juan*2/3;
        Edad_Ana = Edad_Juan*4/3;
        Edad_Mama = Edad_Juan+Edad_Alberto+Edad_Ana;
        System.out.println("La edad de la mamá de Juan es "+Edad_Mama);
        System.out.println("La edad de Juan es "+Edad_Juan);
        System.out.println("La edad de Alberto es "+ Edad_Alberto);
        System.out.println("La edad de Ana es " + Edad_Ana);
    }
}
