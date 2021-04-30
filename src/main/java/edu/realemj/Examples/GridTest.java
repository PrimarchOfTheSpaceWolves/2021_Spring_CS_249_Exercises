package edu.realemj.Examples;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GridTest extends javafx.application.Application {

    private String myText = "abcdefghi";

    private class LabelMouseEnter implements EventHandler<MouseEvent> {
        private int row;
        private int col;
        public LabelMouseEnter(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void handle(MouseEvent e) {
            Label myLabel = (Label)e.getSource();
            String s = myLabel.getText();
            s = "(" + row + "," + col + ") " + s;
            myLabel.setText(s);
        }
    }

    private class LabelMouseExit implements EventHandler<MouseEvent> {
        private int row;
        private int col;
        public LabelMouseExit(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void handle(MouseEvent e) {
            Label myLabel = (Label)e.getSource();
            String s = myLabel.getText();
            String extra = "(" + row + "," + col + ") ";
            int lenExtra = extra.length();
            s = s.substring(lenExtra);
            myLabel.setText(s);
        }
    }

    private class GridLabelPane extends GridPane {
        public GridLabelPane() {

            int index = 0;
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    char c = myText.charAt(index);
                    index++;
                    Label myLabel = new Label("" + c);
                    myLabel.setPrefWidth(100);
                    myLabel.setPrefHeight(100);
                    myLabel.setFont(Font.font(18));
                    myLabel.setOnMouseEntered(new LabelMouseEnter(i,j));
                    myLabel.setOnMouseExited(new LabelMouseExit(i,j));
                    this.add(myLabel, j, i);
                }
            }
        }

        public void update() {
            for(int i = 0; i < getChildren().size(); i++) {
                char c = ' ';
                if(i < myText.length()) {
                    c = myText.charAt(i);
                }
                Node child = getChildren().get(i);
                ((Label)child).setText("" + c);
            }
        }
    }

    public void start(Stage primaryStage) {
        BorderPane mainPane = new BorderPane();
        GridLabelPane glp = new GridLabelPane();
        mainPane.setCenter(glp);

        TextField myStringField = new TextField(myText);
        myStringField.setOnAction(e -> {
            myText = myStringField.getText();
            System.out.println("NEW:" + myText);
            glp.update();
        });
        mainPane.setTop(myStringField);

        Scene scene = new Scene(mainPane, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
