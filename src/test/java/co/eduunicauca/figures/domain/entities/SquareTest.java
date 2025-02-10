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
public class SquareTest {
    
    public SquareTest() {
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
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        Square instance = new Square(10);
        double expResult = 100.0;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);       
    }
    
    @Test
    public void testCalculateArea1() {
        System.out.println("calculateArea");
        Square instance = new Square(5.2);
        double expResult = 27.05;
        double result = instance.calculateArea();
        assertEquals(expResult, result, 0.1);        
    }

    /**
     * Test of calculatePerimetro method, of class Square.
     */
    @Test
    public void testCalculatePerimetro() {
        System.out.println("calculatePerimetro");
        Square instance = new Square(10);
        double expResult = 40.0;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0);        
    }

    @Test
    public void testCalculatePerimetro1() {
        System.out.println("calculatePerimetro");
        Square instance = new Square(5.2);
        double expResult = 20.8;
        double result = instance.calculatePerimetro();
        assertEquals(expResult, result, 0.1);        
    }
    /**
     * Test of getSide method, of class Square.
     */
    @Test
    public void testGetSide() {
        System.out.println("getSide");
        Square instance = new Square(10);
        double expResult = 10.0;
        double result = instance.getSide();
        assertEquals(expResult, result, 0);        
    }
    @Test
    public void testGetSide1() {
        System.out.println("getSide");
        Square instance = new Square(5.2);
        double expResult = 5.2;
        double result = instance.getSide();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setSide method, of class Square.
     */
    @Test
    public void testSetSide() {
        System.out.println("setSide");
        double side = 10.0;
        Square instance = new Square(10);
        instance.setSide(side);
    }
    @Test
    public void testSetSide1() {
        System.out.println("setSide");
        double side = 5.2;
        Square instance = new Square(5.2);
        instance.setSide(side);
    }
}
