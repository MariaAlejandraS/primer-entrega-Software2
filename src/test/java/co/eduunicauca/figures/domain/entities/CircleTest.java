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
public class CircleTest {
    
    public CircleTest() {
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
     * Test of calculateArea method, of class Circle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Circle instance = new Circle(1);
        double expResult = 3.15;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);
       

    }
@Test
    public void testCalculateArea1() {
        System.out.println("calculateArea");
        Circle instance = new Circle(2);
        double expResult = 12.57;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);
       

    }
    /**
     * Test of calculatePerimetro method, of class Circle.
     */
    @Test
    public void testCalculatePerimetro() {
        System.out.println("calculatePerimetro");
        Circle instance = new Circle(1);
        double expResult = 6.28;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0.1);
        
    }

    @Test
    public void testCalculatePerimetro1() {
        System.out.println("calculatePerimetro");
        Circle instance = new Circle(2);
        double expResult = 12.57;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0.1);
        
    }
    /**
     * Test of getRadius method, of class Circle.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Circle instance = new Circle(1);
        double expResult = 1;
        double result = instance.getRadius();
        assertEquals(expResult, result, 0);
    }
 @Test
    public void testGetRadius1() {
        System.out.println("getRadius");
        Circle instance = new Circle(2);
        double expResult = 2;
        double result = instance.getRadius();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setRadius method, of class Circle.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        double radius = 1;
        Circle instance =new Circle(1);
        instance.setRadius(radius);

    }
     @Test
    public void testSetRadius1() {
        System.out.println("setRadius");
        double radius = 2;
        Circle instance =new Circle(2);
        instance.setRadius(radius);

    }
}
