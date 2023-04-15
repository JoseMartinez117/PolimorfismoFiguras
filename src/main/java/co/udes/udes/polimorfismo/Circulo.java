/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.polimorfismo;

/**
 *
 * @author LabSispc13
 */
public class Circulo extends FiguraGeometrica{
    double pi = Math.PI;
    
    public Circulo() {
    }

    public Circulo(double radio, int nLados, double area, double perimetro, double base, double altura) {
        super(nLados, area, perimetro, base, altura, radio);
        Calculo(area, perimetro, base, altura, radio);
        
    }

    @Override
    public void Calculo(double area, double perimetro, double base, double altura, double radio) {
        
        super.Calculo(area, perimetro, base, altura, radio);
        area=pi*(Math.pow(radio, 2));
        perimetro=2*pi*radio;
        
        super.setArea(area);
        super.setPerimetro(perimetro);
        
    }



    
    
    
    

    
    
    
    
    
    
    
    
    
}
