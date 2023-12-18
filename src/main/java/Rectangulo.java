/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.espelife.ejemploherencia.FiguraGeometrica;

/**
 *
 * @author labctr
 */
public class Rectangulo extends FiguraGeometrica {
private double base, altura; 
public Rectangulo(double base, double altura){
this.base= base;
this.altura= altura;
}
    @Override
    public double CalcularArea() {
        area= base*altura; 
        return area; 
    }
    
}
