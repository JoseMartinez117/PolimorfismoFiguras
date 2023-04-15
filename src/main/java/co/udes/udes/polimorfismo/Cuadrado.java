/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.polimorfismo;

/**
 *
 * @author LabSispc13
 */
public class Cuadrado extends FiguraGeometrica{
    
    public Cuadrado() {
    }

    public Cuadrado(int nLados, double area, double perimetro, double base, double altura, double radio) {
        super(nLados=4, area, perimetro, base, altura, radio); 
        Calculo(area, perimetro, base, altura, radio); 
    }    

    @Override
    public void Calculo(double areax, double perimetroy, double basex, double alturay, double radio) {
        super.Calculo(areax, perimetroy, basex, alturay, radio); 
        alturay=basex;
        areax=Math.pow(basex,2);
        perimetroy=basex*basex;
        
        super.setArea(areax);
        super.setAltura(alturay);
        super.setPerimetro(perimetroy);
        
    }
    
   
 

 
    
    
    
    
}
