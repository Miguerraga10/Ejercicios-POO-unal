public class TrianguloRectangulo {
    double Base, Altura;
    TrianguloRectangulo(double Base, double Altura){
        this.Base = Base;
        this.Altura = Altura;
    }
    double Area(){
        return (Base * Altura/2);
    }
    double Perimetro(){
        return (Base + Altura + Hipotenusa());
    }
    double Hipotenusa() { 
        return Math.pow(Base*Base + Altura*Altura, 0.5);
    }
    void TipoTriangulo(){
        if ((Base == Altura) && (Base == Hipotenusa()) && (Altura== Hipotenusa()))
            System.out.println("Es un triángulo equilátero");
        else if ((Base != Altura) && (Base != Hipotenusa()) && (Altura != Hipotenusa()))
            System.out.println("Es un triángulo escaleno");
        else
            System.out.println("Es un triángulo isósceles");
    }
}