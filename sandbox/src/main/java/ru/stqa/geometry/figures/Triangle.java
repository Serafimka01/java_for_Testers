package ru.stqa.geometry.figures;

import java.util.Objects;

public record Triangle(
        double sideA,
        double sideB,
        double sideC
) {

    public Triangle {
        if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new IllegalArgumentException("Сторона треугольника не должна быть отрицательной");
        }
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            throw new IllegalArgumentException("Сумма длин двух сторон треугольника должна быть больше ее третьей стороны");
        }
    }

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double area() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }
}