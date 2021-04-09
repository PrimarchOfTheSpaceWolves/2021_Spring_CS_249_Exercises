package edu.realemj.Exercises14;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MuffinClicker extends javafx.application.Application {
    private int muffinCnt = 0;
    private int clickPower = 1;

    /*
    // NAMED INNER CLASS
    private class MuffinButtonHandler implements
            EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            muffinCnt++;
            Object source = e.getSource();
            if(source instanceof Button) {
                ((Button)source).setText("" + muffinCnt);
            }
        }
    }*/

    public void start(Stage primaryStage) {
        Button gameButton = new Button("0");
        // NAMED INNER CLASS
        //gameButton.setOnAction(new MuffinButtonHandler());

        // ANONYMOUS INNER CLASS
        /*
        gameButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                muffinCnt += clickPower;
                Object source = e.getSource();
                if (source instanceof Button) {
                    updateButtonText((Button) source);
                }
            }

            private void updateButtonText(Button b) {
                b.setText("" + muffinCnt);
            }
        });
        */
        // LAMBDA EXPRESSION
        gameButton.setOnAction(myEvent -> {
            muffinCnt += clickPower;
            Object source = myEvent.getSource();
            if (source instanceof Button) {
                ((Button)source).setText("" + muffinCnt);
            }
        });

        gameButton.setPrefSize(300, 300);

        EventHandler<MouseEvent> mouseGuy = m -> {
            System.out.println("MOUSE: " + m.getX() + "," + m.getY());
        };

        gameButton.setOnMousePressed(mouseGuy);
        gameButton.setOnMouseReleased(mouseGuy);

        Button buyClickPower = new Button("Buy clicking power");
        buyClickPower.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                int cost = 10*clickPower;
                if(muffinCnt >= cost) {
                    muffinCnt -= cost;
                    clickPower *= 2;
                    buyClickPower.setText("Buy clicking power (current: " +
                            clickPower + ")");
                    gameButton.setText("" + muffinCnt);
                }
            }
        });

        BorderPane pane = new BorderPane();
        pane.setCenter(gameButton);
        pane.setBottom(buyClickPower);
        BorderPane.setAlignment(buyClickPower, Pos.CENTER);

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




