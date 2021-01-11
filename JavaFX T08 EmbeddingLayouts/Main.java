package sample;

//Not default import package when create the project
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

    Stage window;

    public static void main (String[] args) {
        launch(args) ;
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("thenewboston");

        //Border pane as main layout template

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);

        Scene scene = new Scene (borderPane,300,250) ;
        window.setScene(scene);
        window.show();

        //Search https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm for more layout panes
    }
}
