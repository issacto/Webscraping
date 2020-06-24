package sample;

import javafx.scene.layout.VBox;


public abstract class Page {
    VBox centre = new VBox();

    public Page(){
    }

    public  VBox getPane(){
        return centre;
    }

}
