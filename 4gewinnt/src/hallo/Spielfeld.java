package hallo;


import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Spielfeld extends JPanel implements MouseListener {

    public Spielfeld() {
        setBackground(Color.WHITE);
        requestFocus();
        addMouseListener(this);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //eigene Zeichnungen
        Graphics2D g2d = (Graphics2D) g;

        //Felder Zeichnen
        for(Feld field : Test.instance.getFields()) {
            field.draw(g2d);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    @Override
    public void mouseEntered(MouseEvent e) {
    }
    @Override
    public void mouseExited(MouseEvent e) {
    }

}