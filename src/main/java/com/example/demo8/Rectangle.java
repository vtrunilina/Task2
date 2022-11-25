package com.example.demo8;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {


    double length;
    double width;
    public Rectangle (Color color, double length, double width)
    {
        this.color=color;
        this.length = length;
        this.width = width;
    }
    public Rectangle ()
    {
        this.color=Color.GREEN;
        this.width=100;
        this.length=100;
    }
    @Override

    double area () {

        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length1=" + length +
                ", width1=" + width +
                ", color=" + color +
                ", color2=" + color2 +
                ", x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillRect(x, y, h, width);

    }}

