package com.example.shape_creator;

import com.example.shape_creator.factory.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;

public class ShapeController {

    @FXML
    private Pane canvas;

    @FXML
    private ComboBox<String> shapeSelector;


    @FXML

    void initialize(){
        shapeSelector.getItems().setAll("Kreis","Rechteck","Dreieck","EmilKreis","Ellipse");
    }


    @FXML
    void onShow(ActionEvent actionEvent) {
        String selected = shapeSelector.getValue();
        System.out.println(selected);
        ShapeCreator creator = getCreator(selected);
        if(creator!=null){
            Shape shape = creator.createShape();//Polymorphie
            canvas.getChildren().add(shape);
        }

    }

    private ShapeCreator getCreator(String type){
        return switch (type){
            case "Kreis" -> new CircleCreator(canvas);
            case "Rechteck" -> new RectangleCreator(canvas);
            case "Dreieck" -> new TriangleCreator(canvas);
            case "EmilKreis" -> new EmilCreator(canvas);
            case "Ellipse" -> new EllipseCreator(canvas);



            default -> null;
        };
    }
}
