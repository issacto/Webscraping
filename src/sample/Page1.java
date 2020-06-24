package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class Page1 extends Page {



    public Page1(){
        //Button for shanghai ranking
        Button ShanghaiRankingButton = new Button();
        ShanghaiRankingButton.setText("Shanghai Ranking");
        ShanghaiRankingButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });

        //Button for shanghai ranking
        Button topRankingButton = new Button();
        topRankingButton.setText("Top QS Ranking");
        topRankingButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println("Hello World!");
            }
        });





        centre.setId("firstPageVbox");
        centre.getChildren().addAll(ShanghaiRankingButton,topRankingButton);
        centre.setAlignment(Pos.BOTTOM_CENTER);
        centre.setPadding(new Insets(12, 12, 12, 12));
        centre.setSpacing(13);
        centre.setStyle("-fx-background-image: url(\"sample/universityPic.png\");"+"-fx-background-size: 300 580;");




    }

}
