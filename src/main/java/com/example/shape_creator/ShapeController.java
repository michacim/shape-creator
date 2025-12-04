package com.example.shape_creator;

import com.example.shape_creator.factory.CircleCreator;
import com.example.shape_creator.factory.RectangleCreator;
import com.example.shape_creator.factory.ShapeCreator;
import com.example.shape_creator.factory.TriangleCreator;
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
        shapeSelector.getItems().setAll("Kreis","Rechteck","Dreieck");
    }


    @FXML
    void onShow(ActionEvent actionEvent) {
        String selected = shapeSelector.getValue();
        System.out.println(selected);
        ShapeCreator creator = getCreator(selected);
        if(creator!=null){
            Shape shape = creator.createShape();
            canvas.getChildren().add(shape);
        }

    }

    private ShapeCreator getCreator(String type){
        return switch (type){
            case "Kreis" -> new CircleCreator(canvas);
            case "Rechteck" -> new RectangleCreator(canvas);
            case "Dreieck" -> new TriangleCreator(canvas);


            default -> null;
        };
    }
}
