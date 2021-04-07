package edu.realemj.Exercises14;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Date;

public class BoringButtonHandler
        implements EventHandler<ActionEvent> {

    private String name;

    public BoringButtonHandler() {
        name = "Default";
    }

    public BoringButtonHandler(String name) {
        this.name = name;
    }

    public void handle(ActionEvent e) {
        Date current = new Date();
        System.out.println(name + ": " + current);
    }
}
