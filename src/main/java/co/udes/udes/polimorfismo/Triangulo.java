/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.polimorfismo;

/**
 *
 * @author LabSispc13
 */
public class Triangulo extends FiguraGeometrica{

    public Triangulo() {
    }

    public Triangulo(int nLados, double area, double perimetro, double base, double altura, double radio) {
        super(nLados=3, area, perimetro, base, altura, radio);
        Calculo(area, perimetro, base, altura, radio);
    }

    @Override
    public void Calculo(double area, double perimetro, double base, double altura, double radio) {
        super.Calculo(area, perimetro, base, altura, radio); 
        area=(base*altura)/2;
        perimetro=(radio*2)+altura;
        radio=0;
        super.setRadio(radio);
        super.setArea(area);
        super.setPerimetro(perimetro);
        
        
    }

    

    
    
    
  
    
}
