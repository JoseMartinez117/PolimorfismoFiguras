/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.udes.udes.polimorfismo;

/**
 *
 * @author LabSispc13
 */
public class FiguraGeometrica {
    private int nLados;
    private double area;
    private double perimetro;
    private double base;
    private double altura;
    private double radio;
    

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(int nLados, double area, double perimetro, double base, double altura, double radio) {
        this.nLados = nLados;
        this.area = area;
        this.perimetro = perimetro;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public int getnLados() {
        return nLados;
    }

    public void setnLpublicados(int nLados) {
        this.nLados = nLados;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     
    public void Calculo(double area, double perimetro, double base, double altura, double radio){
        System.out.println("El calculo es: ");
        
    }
    
    @Override
    public String toString() {
        return "FiguraGeometrica[" + "\n-> nLados=" + nLados + "\n-> area=" + area + "\n-> perimetro=" + perimetro + "\n-> base=" + base + "\n-> altura=" + altura +"\n-> radio="+radio+"\n"+']';
    }


    
    
    
    
    
}
