package com.example.shape_creator.factory;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class EllipseCreator extends ShapeCreator{
    protected EllipseCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(randomX());
        ellipse.setCenterY(randomY());
        ellipse.setRadiusX(120);
        ellipse.setRadiusX(60);
        ellipse.setFill(Color.LIGHTBLUE);
        ellipse.setStroke(Color.BLACK);
        return ellipse;
    }
}
