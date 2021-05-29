package Model;

import javafx.animation.FadeTransition;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Path;

public class Gliter extends EggsDecorator {
    public Circle [] circles = new Circle[8];
    public Gliter(Eggs eggs) {
        super(eggs);
    }

    public void draw(Pane paneGliter) {
        super.draw(paneGliter);
        drawBox(paneGliter);
    }

    private void drawBox(Pane paneGliter) {
        circles [0] = new Circle(210,200,7, Color.RED);
        circles [1] = new Circle(240,230,10, Color.BLUE);
        circles [2] = new Circle(270,260,7, Color.PINK);
        circles [3] = new Circle(300,290,10, Color.ORANGE);
        circles [4] = new Circle(290,200,7, Color.BLACK);
        circles [5] = new Circle(230,300,10, Color.AQUAMARINE);
        circles [6] = new Circle(260,290,7, Color.PURPLE);
        circles [7] = new Circle(220,270,10, Color.CORAL);
        paneGliter.getChildren().addAll(circles[0],circles[1],circles[2],circles[3],circles[4],circles[5],circles[6],circles[7]);
    }
}
