import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        double Ventas_uno, Ventas_dos, Ventas_tres, Salario_general, Salario_uno, Salario_dos, Salario_tres, Porcen, Ventas_total;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite la cantidad de ventas del departamento 1: ");
        Ventas_uno=scanner.nextDouble();
        System.out.print("Digite la cantidad de ventas del departamento 2: ");
        Ventas_dos=scanner.nextDouble();
        System.out.print("Digite la cantidad de ventas del departamento 3: ");
        Ventas_tres=scanner.nextDouble();
        System.out.print("Digite el salario de cada empleado: ");
        Salario_general=scanner.nextDouble();
        Ventas_total= Ventas_uno+Ventas_dos+Ventas_tres;
        Porcen=Ventas_total*0.33;
        if (Ventas_uno>Porcen){
            Salario_uno=Salario_general*1.2;}
        else{
            Salario_uno=Salario_general;}
        if (Ventas_dos>Porcen){
            Salario_dos=Salario_general*1.2;}
        else{
            Salario_dos=Salario_general;}
        if (Ventas_tres>Porcen){
            Salario_tres=Salario_general*1.2;}
        else{
            Salario_tres=Salario_general;}
        System.out.println("Salario trabajador departamento 1 es $"+Salario_uno);
        System.out.println("Salario trabajador departamento 2 es $"+Salario_dos);
        System.out.println("Salario trabajador departamento 3 es $"+Salario_tres);
        scanner.close();
    }
}
