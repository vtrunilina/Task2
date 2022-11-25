package com.example.demo8;

import javafx.scene.control.TextField;

public class ShapeFactory {
    public Shape createShape(TextField nameShape) {
        if (nameShape.getText().equals("Квадрат"))
        {
            return new Rectangle();
        }
        else
        {
            return new Oval();

        }






}}
