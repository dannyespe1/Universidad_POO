package com.espelife.ejemploherencia;
import java.util.Scanner;
public class EjemploHerencia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del Radio:");
        double radio; 
        radio = leer.nextDouble();
        Circulo circulo1 = new Circulo(radio);         
        System.out.println("El area del circulo es:"+ circulo1.CalcularArea());
        
        System.out.println("Ingrese el valor de la base:");
        System.out.println("Ingrese el valor de la altura");
        double base;
        double altura;
        altura= leer.nextDouble();
        base = leer.nextDouble();
        Triangulo triangulo1 =new Triangulo(base,altura);
        System.out.println("El area del triangulo:" +triangulo1.CalcularArea());     
    }
}
