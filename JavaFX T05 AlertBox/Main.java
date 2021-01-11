package sample;

//Not default import package when create the project
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.control.Label;

public class Main1 extends Application {

    Stage window;
    Button button;

    public static void main (String[] args) {
        launch(args) ;
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("thenewboston");
        button = new Button("Click me") ;

        button.setOnAction(e -> AlertBox.display("Title of Window", "wow this alert box is awesome"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300,250) ;
        window.setScene(scene);
        window.show();

    }
}
