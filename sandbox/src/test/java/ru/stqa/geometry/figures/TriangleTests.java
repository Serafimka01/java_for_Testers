package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    public void testCalculateTrianglePerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        double result = triangle.perimeter();
        Assertions.assertEquals(12, result);
    }

    @Test
    public void testCalculateTriangleArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        double result = triangle.area();
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testSideTriangleIsNegative() {
        try {
            new Triangle(-3, 4, 5);
            Assertions.fail();
        } catch (IllegalArgumentException ex) {
            //ok
        }
    }

    @Test
    public void testNonexistentTriangle() {
        try {
            new Triangle(1, 2, 4);
        } catch (IllegalArgumentException ex) {
            //ok
        }
    }
}
