/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.eduunicauca.figures;

import co.eduunicauca.figures.domain.entities.Circle;
import co.eduunicauca.figures.domain.entities.Figure;
import co.eduunicauca.figures.domain.entities.Square;
import co.eduunicauca.figures.domain.entities.Triangle;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author aasol
 */
public class Main {

    public static void main(String[] args) {
        //Polimorfismo (Estoy instanciando círculo de la clase base)
        Figure figi = new Circle(1);
        Figure figi2 = new Square(10);
        Figure figi3 = new Circle(2);
        Figure figi4 = new Square(5.2);
        Figure figi5 = new Triangle(8.0, 3.5, 12.0);
        Figure figi6 = new Triangle(2.0, 9.5, 6.0);
        Figure figi7 = new Triangle(15.0, 12.5, 9.0);
        Figure figi8 = new Triangle(20.0, 15.5, 3.0);
        
        List <Figure> figures = new ArrayList<>();
        
        figures.add(figi);
        figures.add(figi2);
        figures.add(figi3);
        figures.add(figi4);
        figures.add(figi5);
        figures.add(figi6);
        figures.add(figi7);
        figures.add(figi8);
        
        for(Figure fig: figures){
            System.out.println("El área es: " + fig.calculateArea());
            System.out.println("El perímetro es: " + fig.calculatePerimetro());
        }
    }
}
