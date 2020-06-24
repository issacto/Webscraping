package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application {
    VBox centre = new VBox();
    BorderPane root = new BorderPane();
    ArrayList<Page> countPage = new ArrayList<Page>();

    int x = 0;


    @Override
    public void start(Stage primaryStage) throws Exception {

        Button ShanghaiRankingButton = new Button();
        ShanghaiRankingButton.setText("Shanghai Ranking");
        ShanghaiRankingButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Page2 page2 = new Page2();
                root.setCenter(page2.getPane());
            }
        });

        //Button for shanghai ranking
        Button topRankingButton = new Button();
        topRankingButton.setText("Top QS Ranking");
        topRankingButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                IndividualUniversityGUI x = new IndividualUniversityGUI();
            }
        });
        centre.setId("firstPageVbox");
        centre.getChildren().addAll(ShanghaiRankingButton, topRankingButton);
        centre.setAlignment(Pos.BOTTOM_CENTER);
        centre.setPadding(new Insets(12, 12, 12, 12));
        centre.setSpacing(13);
        centre.setStyle("-fx-background-image: url(\"sample/universityPic.png\");" + "-fx-background-size: 500 580;");


        HBox top = new HBox();
        top.setPrefHeight(30);
        top.setBackground(new Background(new BackgroundFill(Color.GREY,
                CornerRadii.EMPTY,
                Insets.EMPTY)));


        HBox bottom = new HBox();
        bottom.setPadding(new Insets(15, 12, 15, 12));
        bottom.setAlignment(Pos.CENTER);
        bottom.setSpacing(10);
        bottom.setPrefHeight(90);

        bottom.setBackground(new Background(new BackgroundFill(Color.GREY,
                CornerRadii.EMPTY,
                Insets.EMPTY)));

        ImageView shanghaiLogo = new ImageView(new Image("sample/ShanghaiPic.png"));
        shanghaiLogo.setFitHeight(40);
        shanghaiLogo.setFitWidth(100);

        ImageView QSLogo = new ImageView(new Image("sample/QSPic.png"));
        QSLogo.setFitHeight(40);
        QSLogo.setFitWidth(100);
        bottom.getChildren().addAll(shanghaiLogo, QSLogo);


        root.setTop(top);
        root.setCenter(centre);
        root.setBottom(bottom);
        //root.setBottom(ShanghaiRankingButton);
        Scene scene = new Scene(root, 500, 700);

        scene.getStylesheets().addAll("sample/stylesheet");
        primaryStage.setTitle("University Ranking");

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}