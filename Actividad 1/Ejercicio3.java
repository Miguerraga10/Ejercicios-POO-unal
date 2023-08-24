public class Ejercicio3 {
    public static void main(String[] args){
        double Salario_Bruto = 0;
        double Retencion_Fuente = 0;
        double Salario_Neto = 0;
        Salario_Bruto = 48*5000;
        Retencion_Fuente =Salario_Bruto*0.125;
        Salario_Neto = Salario_Bruto-Retencion_Fuente;
        System.out.println("El salario bruto es: $"+Salario_Bruto);
        System.out.println("La retención de fuentes es: $"+Retencion_Fuente);
        System.out.println("El sálario neto es: $" +Salario_Neto );
    }
}
