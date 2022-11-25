package com.example.demo8;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected Color color;
    protected Color color2;
    protected Double x;
    protected Double y;
    protected Double w;
    protected Double h;
    protected Double text;

    public Shape(Color color, Color color2, Double x, Double y, Double w, Double h, Color color1, Double text) {

        this.color2 = color2;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    public Shape() {
        this.color2 = Color.BLUE;
        this.x = 20.0 ;
        this.y = 0.0;
        this.w = 20.0;
        this.h = 50.0;
        this.color = Color.BROWN;
    }


    // объявление абстрактных методов
    abstract double area();

    public abstract String toString();

    abstract void draw(GraphicsContext gr);

    // конструктор
    public Shape(String color) {
        System.out.println("Shape constructor called");
        color = color;
    }

    // реализация методов
    public void setColor(Color color) {
        this.color = color;
    }
}

