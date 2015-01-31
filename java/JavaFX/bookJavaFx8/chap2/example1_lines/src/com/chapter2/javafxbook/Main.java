package com.chapter2.javafxbook;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	    
	    // inicialização
	    primaryStage.setTitle("Chapter 2: drawing lines");
	    Group root = new Group();
	    Scene scene = new Scene(root, 300, 300, Color.GRAY);
	    
	    // cria linha e adiciona no root
	    Line line = new Line(50, 100, 250, 100);
        line.setStroke(Paint.valueOf("rgb(255,0,0)"));
        line.setStrokeWidth(10);
        line.setStrokeLineCap(StrokeLineCap.ROUND);
        line.getStrokeDashArray().add(20.0);
        line.setStrokeDashOffset(0);
        root.getChildren().add(line);
        
        // define slider
        Slider slider = new Slider(0, 100, 0);
        slider.setLayoutX(50);
        slider.setLayoutY(200);
        
        // uma propriedade da linha é controlada pelo slider
        line.strokeDashOffsetProperty().bind(slider.valueProperty());
        // adiciona slider no root
        root.getChildren().add(slider);
        
        // define texto
        Text text = new Text("stroke dash offset: 0.0");
        text.setX(50);
        text.setY(170);
        text.setStroke(Color.WHITE);
        
        // uma propriedade do texto é controlada pelo slider
        slider.valueProperty().addListener((oc,curVal,newVal)->
                text.setText("stroke dash offset: "+slider.getValue()));
        root.getChildren().add(text);
        
        // define cena e mostra o palco
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
