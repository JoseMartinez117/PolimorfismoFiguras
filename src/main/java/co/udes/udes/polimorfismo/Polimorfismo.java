/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.udes.udes.polimorfismo;

import java.util.Scanner;

/**
 *
 * @author LabSispc13
 */
public class Polimorfismo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        double areax=0, perimetroy=0, basex=0, alturay=0, radio=0;
        int figura;
        
        System.out.println("A que figura desea sacarle el area y perimetro?");
        System.out.println("1->Cuadrado");
        System.out.println("2->Circulo");
        System.out.println("3->Triangulo");
        System.out.print("Esperando respuesta: ");
        figura=keyboard.nextInt();
        
        
        switch(figura){
            case 1:
                System.out.println("Cuando mide los lados del cuadrado?");
                basex=keyboard.nextDouble();
                FiguraGeometrica myCuadrado = new Cuadrado(4, areax, perimetroy, basex, alturay, radio);
                System.out.println(myCuadrado);
                System.out.println("gracias por su tiempo");
                break;
                
            case 2:
                System.out.println("Cuanto mide el radio del circulo?");
                radio=keyboard.nextDouble();
                FiguraGeometrica myCirculo = new Circulo(radio, 1, areax, perimetroy, basex, alturay);
                System.out.println(myCirculo);
                System.out.println("gracias por su tiempo");
                break;
           
            case 3:
                System.out.println("Cuanto mide la base del triangulo?");
                basex=keyboard.nextDouble();
                System.out.println("Cuanto mide la altura del triangulo?");
                alturay=keyboard.nextDouble();
                System.out.println("Cuanto mide los otros lados del triangulo");
                radio=keyboard.nextDouble();
                
                FiguraGeometrica myTriangulo = new Triangulo(3, areax, perimetroy, basex, alturay, radio);
                System.out.println(myTriangulo);
                System.out.println("gracias por su tiempo");
                break;
            
            default:
                System.out.println("Digito de manera erronea, gracias por su tiempo");
                      
                
                
                
                
              
        }
        
        
        
        
        
    }
}
