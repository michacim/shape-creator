package com.example.shape_creator.factory;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class MichaCircleCreator extends ShapeCreator{
    public MichaCircleCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {
        double radius = rnd.nextDouble(15,40);
        Circle circle = new Circle(randomX(),randomY(),radius);
        circle.setFill(Color.color(rnd.nextDouble(), rnd.nextDouble(), rnd.nextDouble(),0.2));
        circle.setStroke(Color.RED);
        circle.setEffect(new DropShadow());

        return circle;
    }
}
