package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);
        Complex result = a.minus(b);
        assertEquals(3, result.getRe(), 1e-10);
        assertEquals(2, result.getIm(), 1e-10);
    }

    @Test
    public void testConjugate() {
        Complex a = new Complex(3, 4);
        Complex result = a.conjugate();
        assertEquals(3, result.getRe(), 1e-10);
        assertEquals(-4, result.getIm(), 1e-10);
    }

    @Test
    public void testReciprocal() {
        Complex a = new Complex(2, 0);
        Complex result = a.reciprocal();
        assertEquals(0.5, result.getRe(), 1e-10);
        assertEquals(0, result.getIm(), 1e-10);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(6, 8);
        Complex b = new Complex(2, 0);
        Complex result = a.divide(b);
        assertEquals(3, result.getRe(), 1e-10);
        assertEquals(4, result.getIm(), 1e-10);
    }
}