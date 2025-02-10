/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.eduunicauca.figures.domain.entities;

/**
 *
 * @author aasol
 */
public class Triangle extends Figure{

    private double base;
    private double altura;
    private double lado;

    public Triangle(double base, double altura, double lado) {
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }
    
    @Override
    public double calculateArea() {
        return base/2 * altura;
    }

    @Override
    public double calculatePerimetro() {
        return lado*3;
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
}
