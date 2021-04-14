package edu.realemj.Exercises15;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WagonGame extends javafx.application.Application {
    public void start(Stage primaryStage) {
        Pane mainPane = new Pane();

        ImageView background = new ImageView("https://web.cs.sunyit.edu/~realemj/files/clouds.jpg");
        background.fitWidthProperty().bind(mainPane.widthProperty());
        background.fitHeightProperty().bind(
                mainPane.heightProperty().divide(3).multiply(2)
        );
        mainPane.getChildren().add(background);

        Text wagonText = new Text(20, 30, "Wagon");
        wagonText.setFont(Font.font("Times New Roman",
                FontWeight.BOLD,
                FontPosture.ITALIC, 36));
        wagonText.setFill(Color.BLUE);
        mainPane.getChildren().add(wagonText);

        Line groundLine = new Line();
        groundLine.startXProperty().set(0);
        groundLine.endXProperty().bind(mainPane.widthProperty());
        groundLine.startYProperty().bind(
                mainPane.heightProperty().divide(3).multiply(2)
        );
        groundLine.endYProperty().bind(
                mainPane.heightProperty().divide(3).multiply(2)
        );
        groundLine.setStroke(Color.GREEN);
        groundLine.setStrokeWidth(20);
        mainPane.getChildren().add(groundLine);

        mainPane.heightProperty().addListener(e -> {
            System.out.println("HEIGHT NOW: " + mainPane.heightProperty().get());
        });

        WagonPane wagon = new WagonPane();
        //wagon.translateXProperty().bind(
        //        mainPane.widthProperty().divide(2).subtract(40)
        //);
        //wagon.translateYProperty().bind(
        //        mainPane.heightProperty().divide(3).multiply(2).subtract(65)
        //);
        mainPane.getChildren().add(wagon);

        mainPane.setOnMouseMoved(m -> {
            wagon.setTranslateX(m.getX() - 40);
            wagon.setTranslateY(m.getY() - 40);
        });

        mainPane.setOnMouseClicked(m -> {
            if(m.getButton() == MouseButton.PRIMARY) {
                wagon.setRotate(wagon.getRotate() + 45);
            }
            else if(m.getButton() == MouseButton.SECONDARY) {
                wagon.setRotate(wagon.getRotate() - 45);
            }
        });

        Scene scene = new Scene(mainPane, 800, 600);

        scene.setOnKeyPressed(k -> {
            switch(k.getCode()) {
                case A:
                    wagon.setTranslateX(wagon.getTranslateX() - 2);
                    break;
                case D:
                    wagon.setTranslateX(wagon.getTranslateX() + 2);
                    break;
                default:
                    break;
            }
        });

        primaryStage.setTitle("Wagon Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}

class WagonPane extends Pane {
    public WagonPane() {
        Rectangle coverBase = new Rectangle(7, 0, 66, 52);
        coverBase.setFill(Color.WHITE);
        coverBase.setStroke(Color.BLACK);
        this.getChildren().add(coverBase);

        Rectangle wagonBed = new Rectangle(0, 50, 80, 5);
        wagonBed.setFill(Color.BROWN);
        wagonBed.setStroke(Color.BLACK);
        this.getChildren().add(wagonBed);
    }
}
