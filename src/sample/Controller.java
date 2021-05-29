package sample;

import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Controller {
        @FXML
        public Pane paneEgg;
        Eggs eg = new SimleEgg();
        @FXML
        public void initialize()
        {
            paneEgg.toFront();
            eg.draw(paneEgg);
        }

    public void boxclick(ActionEvent actionEvent) {
        paneEgg.getChildren().clear();
        paneEgg.toFront();
        eg.draw(paneEgg);
        Eggs box = new Box(eg);
        box.draw(paneEgg);
    }

    public void glitclick(ActionEvent actionEvent) {
        paneEgg.getChildren().clear();
        paneEgg.toFront();
        eg.draw(paneEgg);
        Eggs gl = new Gliter(eg);
        gl.draw(paneEgg);
    }

    public void nameclick(ActionEvent actionEvent) {
        paneEgg.getChildren().clear();
        paneEgg.toFront();
        eg.draw(paneEgg);
        Eggs name = new NamePr(eg);
        name.draw(paneEgg);
    }

    public void delete(ActionEvent actionEvent) {
        paneEgg.getChildren().clear();
        paneEgg.toFront();
        eg.draw(paneEgg);
    }

    public void vseclick(ActionEvent actionEvent) {
        paneEgg.getChildren().clear();
        paneEgg.toFront();
        eg.draw(paneEgg);
        Eggs name = new Box(new NamePr(new Gliter(eg)));
        name.draw(paneEgg);
    }
}
