package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;  //All choice is listed out. Can choose 1 or more at same the time

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Bucky's Meat Subs");
        button = new Button ("Submit");

        listView = new ListView<>();
        listView.getItems().addAll("Iron man", "Titanic", "Avatar");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        //Can select multiple

        button.setOnAction(e -> buttonClicked() );

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(listView, button);


        scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    //Print out movies
    private void buttonClicked(){
        String message = "";
        ObservableList<String> movies;  //ObservableList = A list that allows listeners
                                        //to track changes when they occur.
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m: movies){
            message += m + "\n";
        }

        System.out.println(message);
    }
}