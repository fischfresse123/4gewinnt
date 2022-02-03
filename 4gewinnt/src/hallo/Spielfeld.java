package hallo;


import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Spielfeld extends JPanel implements MouseListener {
	JButton eins = new JButton("1");
	JButton zwei = new JButton("2");
	JButton drei = new JButton("3");
	JButton vier = new JButton("4");
	JButton fünf = new JButton("5");
	JButton sechs = new JButton("6");
	JButton sieben = new JButton("7");
	
	
	
    public Spielfeld() {
    	add(eins);
    	add(zwei);
    	add(drei);
    	add(vier);
    	add(fünf);
    	add(sechs);
    	add(sieben);
    	
    	
    	//eins.setbounds
        
    	
    	
    	setBackground(Color.WHITE);
        requestFocus();
        addMouseListener(this);
        setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //eigene Zeichnungen
        Graphics2D g2d = (Graphics2D) g;

        //Felder Zeichnen
        for(Feld field : Controller.instance.getFields()) {
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