package sample;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {
    public static void display(String title, String message) {
        Stage window = new Stage() ;

        window.initModality(Modality.APPLICATION_MODAL);
        //Block other input events or user interaction with other windows until this taken
        //care of
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Closes the window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER) ;

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();

    }
}





















