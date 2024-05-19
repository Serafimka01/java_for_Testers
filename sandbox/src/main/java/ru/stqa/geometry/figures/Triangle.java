package ru.stqa.geometry.figures;

import java.util.Objects;

public record Triangle(
        double sideA,
        double sideB,
        double sideC
) {
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double area() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }
}