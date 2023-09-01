public class Figuras {
    public static void main(String[] args){
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2  = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        System.out.println("El área del circulo es = "+ figura1.Area());
        System.out.println("El perímetro del círculo es = "+ figura1.Perimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.Area());
        System.out.println("El perímetro del rectángulo es = " + figura2.Perimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.Area());
        System.out.println("El perímetro del cuadrado es = " + figura3.Perimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.Area());
        System.out.println("El perímetro del triángulo es = " + figura4.Perimetro());
        figura4.TipoTriangulo();
    }
}