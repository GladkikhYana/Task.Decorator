package Model;

import javafx.scene.layout.Pane;

public abstract class EggsDecorator implements Eggs{
    private Eggs eggs;
    public EggsDecorator(Eggs eggs)
    {
    this.eggs = eggs;
    }
    public void draw(Pane pane)
    {
    eggs.draw(pane);
    }
}
