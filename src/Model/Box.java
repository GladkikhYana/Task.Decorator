package Model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Box extends EggsDecorator{
    public Box(Eggs eggs) {
        super(eggs);
    }
    public void draw (Pane paneBox)
    {
        super.draw(paneBox);
        drawBox(paneBox);
    }

    private void drawBox(Pane paneBox) {
        Rectangle r = new Rectangle();
        r.setX(165);
        r.setY(270);
        r.setWidth(170);
        r.setHeight(90);
        r.setArcWidth(20);
        r.setArcHeight(20);
        r.setFill(Color.BROWN);
        paneBox.getChildren().addAll(r);
    }
}
