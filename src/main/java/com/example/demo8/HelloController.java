package com.example.demo8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {

    public TextField Calculate;
    public TextField nameShape;
   

    @FXML
    private Canvas canvas;


    @FXML
    protected void onHelloButtonClickRec() {
        double text = Double.parseDouble(Calculate.getText());
        GraphicsContext gr = canvas.getGraphicsContext2D();
        Rectangle rec = new Rectangle(Color.BLACK, 100, text);
        System.out.println(rec.toString());
        rec.draw(gr);

    }


    @FXML
    protected void onHelloButtonClickOval() {
        double text = Double.parseDouble(Calculate.getText());
        GraphicsContext gr = canvas.getGraphicsContext2D();
        Oval ova = new Oval(Color.BROWN, 100, text);
        System.out.println(ova.toString());
        ova.draw(gr);
    }

@FXML
protected void onHelloButtonClickVibor(){
    ShapeFactory sf = new ShapeFactory(); //get an object  and call its draw method.


     Shape shape = sf.createShape(nameShape);//
     GraphicsContext gr = canvas.getGraphicsContext2D();
     shape.draw(gr);

    System.out.println(shape.toString());
   // GraphicsContext gr = canvas.getGraphicsContext2D(); //получить контекст(холст) для рисования

  //  shape.draw(gr); //вызов метода рисования по холсту

    }
}