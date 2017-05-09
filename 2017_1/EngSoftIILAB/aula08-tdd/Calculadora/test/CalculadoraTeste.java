/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author rb
 */
public class CalculadoraTeste {

    Calculadora c;

    @Before
    public void setUp() throws Exception {
        this.c = new Calculadora();
    }

    @Test
    public void testarSoma() {
        assertEquals(this.c.somar(1,1), 2);
        assertEquals(this.c.somar(1,2), 3);
        assertEquals(this.c.somar(2,3), 5);
        assertEquals(this.c.somar(3,5), 8);
        assertEquals(this.c.somar(5,8), 13);
    }

    @Test
    public void testarSubtracao() {
        assertEquals(this.c.subtrair(1,1), 0);
        assertEquals(this.c.subtrair(1,2), -1);
        assertEquals(this.c.subtrair(2,3), -1);
        assertEquals(this.c.subtrair(3,5), -2);
        assertEquals(this.c.subtrair(5,8), -3);
    }

    @Test
    public void testarMultiplicacao() {
        assertEquals(this.c.multiplicar(1, 1), 1);
        assertEquals(this.c.multiplicar(0, 1), 0);
        assertEquals(this.c.multiplicar(1, 2), 2);
        assertEquals(this.c.multiplicar(2, 2), 4);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testarDivisao() {
        assertEquals(this.c.dividir(1, 1), 1);
        assertEquals(this.c.dividir(10, 2), 5);
        assertEquals(this.c.dividir(1, 1), 1);
        assertEquals(this.c.dividir(1, 0), 0);
    }
}
