import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        String Nombre;
        int Horas;
        Double Valor_Hora, Salario;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador: ");
        Nombre=scanner.nextLine();
        System.out.print("Digite el numero de horas trabajadas al mes: ");
        Horas=scanner.nextInt();
        System.out.print("Digite el valor por hora trabajada: ");
        Valor_Hora=scanner.nextDouble();
        Salario=Valor_Hora*Horas;
        System.out.println("El nombre del empleado es "+Nombre);
        if(Salario>450000){
            System.out.println("El salario es $"+Salario);}
        scanner.close();
    }
}