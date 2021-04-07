package edu.realemj.Exercises14;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PaneExample extends javafx.application.Application {
    public void start(Stage primaryStage) {
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");

        /*
        //StackPane pane = new StackPane();
        //FlowPane pane = new FlowPane();
        VBox pane = new VBox();
        pane.getChildren().add(b1);
        pane.getChildren().add(b2);
        pane.getChildren().add(b3);
        pane.getChildren().add(b4);
        pane.getChildren().add(b5);
        //StackPane.setAlignment(b1, Pos.TOP_LEFT);
         */

        /*
        GridPane pane = new GridPane();
        pane.add(b1, 0,0);
        pane.add(b2, 2, 0);
        pane.add(b3, 1,1);
        pane.add(b4, 0, 2);
        pane.add(b5, 2,2);
         */

        BorderPane pane = new BorderPane();
        pane.setTop(b1);
        pane.setCenter(b2);
        pane.setBottom(b3);
        pane.setLeft(b4);
        pane.setRight(b5);
        BorderPane.setAlignment(b1, Pos.CENTER);
        BorderPane.setAlignment(b2, Pos.CENTER);
        BorderPane.setAlignment(b3, Pos.CENTER);
        BorderPane.setAlignment(b4, Pos.CENTER);
        BorderPane.setAlignment(b5, Pos.CENTER);

        Scene scene = new Scene(pane, 200, 200);
        scene.getStylesheets().add("test.css");
        b1.getStyleClass().add("my-button");

        primaryStage.setTitle("Pane example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
