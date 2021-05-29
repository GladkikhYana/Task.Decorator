package Model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class NamePr extends EggsDecorator{
    public Line[] line = new Line[8];
    public NamePr(Eggs eggs) {
        super(eggs);
    }

    public void draw (Pane paneName)
    {
        super.draw(paneName);
        drawName(paneName);
    }

    private void drawName(Pane paneName) {
        Text text = new Text();
        text.setText("Христос Воскресе!");
        text.setX(200);
        text.setY(200);
        text.setStroke(Color.BLUE);
        paneName.getChildren().addAll(text);
    }
}
