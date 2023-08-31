import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String Nombre;
        Double Pago, Valor_Hora;
        int Horas;
        System.out.print("Digite el nombre del trabajador: ");
        Nombre= scanner.nextLine();
        System.out.print("Digite el valor de la hora de trabajo del trabajador: ");
        Valor_Hora= scanner.nextDouble();
        System.out.print("Digite la cantidad de horas trabajadas en la semana: ");
        Horas=scanner.nextInt();
        Pago=0.0;
        if (Horas<=40){
            Pago+=Horas*Valor_Hora;}
        else if (Horas<=48){
            Horas-=40;
            Pago+=40*Valor_Hora;
            Pago+=Horas*2*Valor_Hora;}
        else{
            Horas-=48;
            Pago+=40*Valor_Hora;
            Pago+=16*Valor_Hora;
            Pago+=Horas*3*Valor_Hora;}
        System.out.println("El trabajador "+Nombre+" tiene un salario semanal de $"+Pago);
        scanner.close();
    }
}
