package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.ShanghaiReader;

import java.util.ArrayList;

public class Page2 extends Page {


    public Page2(){
        ScrollPane recordsPane = new ScrollPane();
        recordsPane.setPrefSize(120, 580);
        VBox box = new VBox();
        ShanghaiReader universityListings = new ShanghaiReader();
        recordsPane.setContent(box);
        centre.getChildren().addAll(recordsPane);

        for (String[] university : universityListings.getListings()) {
            int y = university[0].length();
            int z = university[1].length();
            HBox x = new HBox();
            x.setMinWidth(500);
            x.setMinHeight(50);
            x.setStyle("-fx-border-color: black;");

            Label r = new Label(university[0].substring(1,y) +" "+university[1].substring(0,z-1));
            r.setMinWidth(400);
            r.setMinHeight(40);
            r.setStyle("-fx-border-color: black;");


            Button button = new Button("Click");
            button.setId("universityButton");

            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Stage x = new Stage();
                    BorderPane root = new BorderPane();
                    Scene scene = new Scene(root, 100, 150);

                    scene.getStylesheets().addAll("sample/stylesheet");
                    x.setTitle("University Ranking");

                    x.setScene(scene);
                    x.setResizable(false);
                    x.show();


                }
            });


            x.getChildren().addAll(r,button);
            box.getStylesheets().addAll("sample/stylesheet");
            box.getChildren().add(x);





        }
    }


}
