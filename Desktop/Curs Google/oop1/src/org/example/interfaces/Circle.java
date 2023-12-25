package org.example.interfaces;

public class Circle implements IFormaGeometrica{
    private double raza;

    public Circle(double raza){
        this.raza = raza;
    }

    @Override
    public double calculeazaAria() {
        return Math.PI * raza * raza;
    }

    @Override
    public double calculeazPerimetrul() {
        return 0;
    }
}
