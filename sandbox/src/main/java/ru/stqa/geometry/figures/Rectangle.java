package ru.stqa.geometry.figures;

public record Rectangle(double sideA, double sideB) {

    public Rectangle {
        if (sideA < 0 || sideB < 0)  {
            throw new IllegalArgumentException("Сторона прямоугольника не должна быть отрицательной");
        }
    }
    public static void printRectangleArea(double a, double b) {
        String text = String.format("Площадь квадрата со сторонами %f и %f = %f",a,b,rectangleArea(a, b));
        System.out.println(text);
    }

    private static double rectangleArea(double a, double b) {
        return a*b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return (Double.compare(sideA, rectangle.sideA) == 0 && Double.compare(sideB, rectangle.sideB) == 0)
                || (Double.compare(sideA, rectangle.sideB) == 0 && Double.compare(sideB, rectangle.sideA) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
