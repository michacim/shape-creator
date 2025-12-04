package com.example.shape_creator.factory;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class TriangleCreator extends ShapeCreator {

    public TriangleCreator(Pane canvas) {
        super(canvas);
    }

    @Override
    public Shape createShape() {

        // Drei zufällige Punkte erzeugen
        double x1 = randomX();
        double y1 = randomY();
        double x2 = randomX();
        double y2 = randomY();
        double x3 = randomX();
        double y3 = randomY();

        Polygon triangle = new Polygon(
                x1, y1,
                x2, y2,
                x3, y3
        );
        triangle.setFill(Color.color(
                rnd.nextDouble(),
                rnd.nextDouble(),
                rnd.nextDouble(),
                0.6
        ));
        triangle.setStroke(Color.BLACK);

        return triangle;
    }
}
