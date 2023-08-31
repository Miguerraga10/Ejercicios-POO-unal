import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double Patrimonio, Pago;
        String Nombre;
        int Estrato, Inscrip;
        System.out.print("Digite el numero de inscripción del estudiante: ");
        Inscrip = scanner.nextInt();
        System.out.print("Digite el nombre del estudiante: ");
        Nombre = scanner.next();
        System.out.print("Digite el patrimonio del estudiante: ");
        Patrimonio = scanner.nextDouble();
        System.out.print("Digite el estrato social del estudiante: ");
        Estrato = scanner.nextInt();
        Pago = 50000;
        if ((Patrimonio>2000000) && (Estrato>3)) {
            Pago+= Patrimonio*0.03;}
        System.out.println("El estudiante "+Nombre+ " con numero de incripción "+Inscrip+" debe pagar $"+Pago);
        scanner.close();
    }
}
