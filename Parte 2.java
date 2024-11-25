public class Triangulo {
    public double base;
    public double altura;
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double Area(){
        return base*altura/2;
    }
    
    public double Perimetro(){
        return base+altura+Hipotenusa();
        
    }    
    public double Hipotenusa(){
        return Math.pow((base*base)+(altura*altura), 0.5);
    }
    /*No se define un condicional para el triangulo equilatero ya que 
      un triangulo rectangulo en geometria euclidiana NUNCA es equilatero*/
    void tipoTriangulo(){
        if ((base==altura)&& (altura!=Hipotenusa())){
            System.out.println("El triangulo es isosceles");    
    }else {
            System.out.println("El triangulo es escaleno");
        }
    }
    
}

public class Rectangulo {
    public double lado1;
    public double lado2;
    
    Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double Area(){
        return lado1*lado2;
    }
    public double Perimetro(){
        return (2*lado1) + (2*lado2);
    }
}

public class Cuadrado {
    public double lado;
    
    Cuadrado(double lado){
        this.lado = lado;
    }
    public double Area(){
        return Math.pow(lado,2);
    }
    public double Perimetro(){
        return 4*lado;
    }   
}

public class Circulo {
    public double radio;
    
    Circulo(double radio){
        this.radio = radio;
    }
    public double Area(){
        return Math.PI *Math.pow(radio,2);
    }
    
    public double Perimetro(){
        return 2*Math.PI * radio;
    }   
}

import java.util.Scanner;

public class Parte2 {
    
    public static void main(String[] args) {
        
        double radio, lado, lado1, lado2, base, altura;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el el radio del circulo: ");
        radio = entrada.nextDouble();
        Circulo circulo = new Circulo(radio);
        
        System.out.println("Ingrese la base del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        lado2 = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        
        System.out.println("Ingrese la longitud del lado del cuadrado: ");
        lado = entrada.nextDouble();
        Cuadrado cuadrado = new Cuadrado(lado);
        
        System.out.println("Ingrse la base del triangulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        altura = entrada.nextDouble();
        Triangulo triangulo = new Triangulo(base,altura);
        
        
        System.out.println("El area del circulo es: "+ circulo.Area());
        System.out.println("El perimetro del circulo es: "+ circulo.Perimetro());
        
        System.out.println("El area del rectangulo es: "+ rectangulo.Area());
        System.out.println("El perimetro del rectangulo es: "+ rectangulo.Perimetro());        
        
        System.out.println("El area del cuadrado es: "+ cuadrado.Area());
        System.out.println("El perimetro del cuadrado es: "+ cuadrado.Perimetro());
        
        System.out.println("El area del triangulo es: "+ triangulo.Area());
        System.out.println("El perimetro del triangulo es: "+ triangulo.Perimetro());
        triangulo.tipoTriangulo();   
    }   
}

