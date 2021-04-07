package edu.realemj.Exercises14;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MuffinClicker extends javafx.application.Application {
    private int muffinCnt = 0;

    private class MuffinButtonHandler implements
            EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            muffinCnt++;
            Object source = e.getSource();
            if(source instanceof Button) {
                ((Button)source).setText("" + muffinCnt);
            }
        }
    }

    public void start(Stage primaryStage) {
        Button gameButton = new Button("0");
        gameButton.setOnAction(new MuffinButtonHandler());
        gameButton.setPrefSize(300, 300);

        BorderPane pane = new BorderPane();
        pane.setCenter(gameButton);

        Scene scene = new Scene(pane, 600, 600);
        scene.getStylesheets().add("https://web.cs.sunyit.edu/~realemj/files/MuffinClicker.css");
        gameButton.getStyleClass().add("muffin-button");

        primaryStage.setTitle("MUFFIN CLICKER!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }

}




