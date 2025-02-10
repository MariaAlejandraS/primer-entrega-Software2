/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.eduunicauca.figures.domain.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aasol
 */
public class TriangleTest {
    
    public TriangleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        double expResult = 14.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);
    }
     @Test
    public void testCalculateArea1() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        double expResult = 9.5;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);
    }
     @Test
    public void testCalculateArea2() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        double expResult = 93.76;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);
    }
     @Test
    public void testCalculateArea3() {
        System.out.println("calculateArea");
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        double expResult = 155.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of calculatePerimetro method, of class Triangle.
     */
    @Test
    public void testCalculatePerimetro() {
        System.out.println("calculatePerimetro");
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        double expResult = 36.0;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testCalculatePerimetro1() {
        System.out.println("calculatePerimetro");
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        double expResult = 18.0;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testCalculatePerimetro2() {
        System.out.println("calculatePerimetro");
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        double expResult = 27.0;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testCalculatePerimetro3() {
        System.out.println("calculatePerimetro");
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        double expResult = 9.0;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of getBase method, of class Triangle.
     */
    @Test
    public void testGetBase() {
        System.out.println("getBase");
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        double expResult = 8.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.1);       
    }
     @Test
    public void testGetBase1() {
        System.out.println("getBase");
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        double expResult = 2.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.1);
    }
     @Test
    public void testGetBase2() {
        System.out.println("getBase");
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        double expResult = 15.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.1);
    }
     @Test
    public void testGetBase3() {
        System.out.println("getBase");
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        double expResult = 20.0;
        double result = instance.getBase();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of setBase method, of class Triangle.
     */
    @Test
    public void testSetBase() {
        System.out.println("setBase");
        double base = 8.0;
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        instance.setBase(base);
    }
    @Test
    public void testSetBase1() {
        System.out.println("setBase");
        double base = 2.0;
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        instance.setBase(base);
    }
    @Test
    public void testSetBase2() {
        System.out.println("setBase");
        double base = 15.0;
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        instance.setBase(base);
    }
    @Test
    public void testSetBase3() {
        System.out.println("setBase");
        double base = 20.0;
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        instance.setBase(base);
    }

    /**
     * Test of getAltura method, of class Triangle.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        double expResult = 3.5;
        double result = instance.getAltura();
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testGetAltura1() {
        System.out.println("getAltura");
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        double expResult = 9.5;
        double result = instance.getAltura();
        assertEquals(expResult, result, 0.1);       
    }
    @Test
    public void testGetAltura2() {
        System.out.println("getAltura");
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        double expResult = 12.5;
        double result = instance.getAltura();
        assertEquals(expResult, result, 0.1);
    }
    @Test
    public void testGetAltura3() {
        System.out.println("getAltura");
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        double expResult = 15.5;
        double result = instance.getAltura();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of setAltura method, of class Triangle.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        double altura = 3.5;
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        instance.setAltura(altura);
    }
    @Test
    public void testSetAltura1() {
        System.out.println("setAltura");
        double altura = 9.5;
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        instance.setAltura(altura);
    }
    @Test
    public void testSetAltura2() {
        System.out.println("setAltura");
        double altura = 12.5;
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        instance.setAltura(altura);
    }
    @Test
    public void testSetAltura3() {
        System.out.println("setAltura");
        double altura = 15.5;
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        instance.setAltura(altura);
    }

    /**
     * Test of getLado method, of class Triangle.
     */
    @Test
    public void testGetLado() {
        System.out.println("getLado");
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        double expResult = 12.0;
        double result = instance.getLado();
        assertEquals(expResult, result, 0.1);
    }
     @Test
    public void testGetLado1() {
        System.out.println("getLado");
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        double expResult = 6.0;
        double result = instance.getLado();
        assertEquals(expResult, result, 0.1);       
    }
     @Test
    public void testGetLado2() {
        System.out.println("getLado");
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        double expResult = 9.0;
        double result = instance.getLado();
        assertEquals(expResult, result, 0.1);
    }
     @Test
    public void testGetLado3() {
        System.out.println("getLado");
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        double expResult = 3.0;
        double result = instance.getLado();
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of setLado method, of class Triangle.
     */
    @Test
    public void testSetLado() {
        System.out.println("setLado");
        double lado = 12.0;
        Triangle instance = new Triangle(8.0, 3.5, 12.0);
        instance.setLado(lado);
    }
    @Test
    public void testSetLado1() {
        System.out.println("setLado");
        double lado = 6.0;
        Triangle instance = new Triangle(2.0, 9.5, 6.0);
        instance.setLado(lado);
    }
    @Test
    public void testSetLado2() {
        System.out.println("setLado");
        double lado = 9.0;
        Triangle instance = new Triangle(15.0, 12.5, 9.0);
        instance.setLado(lado);
    }
    @Test
    public void testSetLado3() {
        System.out.println("setLado");
        double lado = 3.0;
        Triangle instance = new Triangle(20.0, 15.5, 3.0);
        instance.setLado(lado);
    }
    
}
