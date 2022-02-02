package hallo;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Feld extends Rectangle {

    private FeldValue value;

    public Feld(int x, int y, int width, int height) {
        super(x, y, width, height);
        value = FeldValue.EMPTY;
        }
    //Rahmen
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, width, height);

        //Symbol Zeichnung
        if(value == FeldValue.O) {
        g2d.drawOval(x + 5, y + 5, width - 10, height - 10);

        } else if(value == FeldValue.X) {

        }
        }

        public FeldValue getValue() {
        return value;
    }

    public void setValue(FeldValue value) {
        this.value = value;
    }

}