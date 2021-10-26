package com.company;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        final String[] str = {new String()};
        final String[] str1 = {new String()};
        Calculus calc = new Calculus();

        Label label = new Label();
        TextField textField = new TextField();
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        Button equal = new Button("=");
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                str[0] = textField.getText();
                textField.clear();
                int x = Integer.parseInt(str[0]);
                calc.setX(x);
                calc.setOperator("+");
            }
        });

        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                str[0] = textField.getText();
                textField.clear();
                int x = Integer.parseInt(str[0]);
                calc.setX(x);
                calc.setOperator("-");
            }
        });
        multiply.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                str[0] =textField.getText();
                textField.clear();
                int x = Integer.parseInt(str[0]);
                calc.setX(x);
                calc.setOperator("*");
            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                str[0] = textField.getText();
                textField.clear();
                int x = Integer.parseInt(str[0]);
                calc.setX(x);
                calc.setOperator("/");
            }
        });
        equal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                str1[0] = textField.getText();
                textField.clear();
                int y = Integer.parseInt(str1[0]);
                calc.setY(y);
                label.setText(Double.toString(calc.Calc()));
                //  label.setText("SWAMP");
            }
        });

        FlowPane root = new FlowPane(10, 10, textField, plus, minus, multiply, divide, equal, label);
        Scene scene = new Scene(root, 500, 400);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}