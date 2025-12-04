package com.example.shape_creator.factory;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class EmilCreator extends ShapeCreator{
    public EmilCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {
        double radius = rnd.nextDouble(15,40);
        Circle circle = new Circle(randomX(),randomY(),radius);
        circle.setFill(Color.color(rnd.nextDouble(), rnd.nextDouble(), rnd.nextDouble(),0.6));
        circle.setStroke(Color.BLUE);
        circle.setEffect(new DropShadow(10, Color.BLACK));
        circle.setEffect(new GaussianBlur(10));

        return circle;
    }
}
