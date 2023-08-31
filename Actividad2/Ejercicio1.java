import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        int Horas;
        double Codigo, Valor_Hora, Salario_Bruto, Retencion_Fuente, Salario_Neto;
        String Nombre;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el codigo del empleado: ");
        Codigo=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del trabajador: ");
        Nombre=scanner.nextLine();
        System.out.print("Digite el numero de horas trabajadas al mes: ");
        Horas=scanner.nextInt();
        System.out.print("Digite el valor por hora trabajada: ");
        Valor_Hora=scanner.nextDouble();
        System.out.print("Digite el porcentaje de retención de fuente en decimal: ");
        Retencion_Fuente=scanner.nextDouble();
        Salario_Bruto=Valor_Hora*Horas;
        Salario_Neto=Salario_Bruto*(1-Retencion_Fuente);
        System.out.println("El codigo del empleado es "+Codigo);
        System.out.println("El nombre del empleado es "+Nombre);
        System.out.println("El salario bruto es $"+Salario_Bruto);
        System.out.println("El sálario neto es $" +Salario_Neto );
        scanner.close();
    }
}