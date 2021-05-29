package Model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

import java.lang.annotation.ElementType;

public class SimleEgg implements Eggs{
    @Override
    public void draw(Pane paneEgg) {
        drawEgg(paneEgg);
    }

    private void drawEgg(Pane paneEgg) {
        Ellipse ellipse = new Ellipse(250.0f, 250.0f, 70.0f, 100.f);
        paneEgg.getChildren().add(ellipse);
        ellipse.setFill(Color.YELLOW);
        ellipse.setStroke(Color.BLACK);
    }
}
