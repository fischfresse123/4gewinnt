package hallo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller implements ActionListener {
	JButton Start = new JButton("Start Game");
	JButton regeln = new JButton("Regeln");
	JButton exit = new JButton("Exit Game");
	JFrame w = new JFrame();
	
	public static haupt instance;
	
	Controller() {
		//w.setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("viergewinnticon.png")));
		w.setTitle("VIER GEWINNT"); // ver�ndert den Titel des Fensters
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Wenn auf das rote Kreuz gedr�ckt wird, dann schlie�t sich das Fenster
		w.setSize(800, 600); // Die Gr��e des Fensters wird auf 800x600 Pixel gesetzt
		w.setLocationRelativeTo(null); // Wenn das Fenster ge�ffnet wird, erscheint es in der Mitte des Bildschirms
		w.setResizable(false); // Man kann die Gr��e des Fensters nun nicht manuell �ndern

		JPanel menu = new JPanel(); // Ein neues JPanel wird erstellt, auf das dann die Buttons kommen
		w.add(menu); // Das JPanel wird auf das Fenster hinzugef�gt

		Start.setBackground(Color.BLUE); // Der Start-Button wird im Hintergrund blau
		Start.setForeground(Color.WHITE); // Der Start-Button bekommt die Schriftfarbe wei�
		Start.setFocusPainted(false); //
		Start.setFont(new Font("Tahoma", Font.BOLD, 12)); // Die Schriftart wird Tahoma, die Schriftgr��e 12 und der Text wird fett
		Start.addActionListener(this); // Dies ist n�tig, damit der ActionListener auf den Button zugreifen kann
		
		// Der Button Regeln erh�lt die gleichen Einstellungen wie der Button Start
		regeln.setBackground(Color.BLUE);
		regeln.setForeground(Color.WHITE);
		regeln.setFocusPainted(false);
		regeln.setFont(new Font("Tahoma", Font.BOLD, 12));
		regeln.addActionListener(this);
		
		// Der Button Exit erh�lt die gleichen Einstellungen wie der Button Start
		exit.setBackground(Color.BLUE);
		exit.setForeground(Color.WHITE);
		exit.setFocusPainted(false);
		exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		exit.addActionListener(this);

		// Die drei Buttons werden auf das JPanel hinzugef�gt
		menu.add(Start);
		menu.add(regeln);
		menu.add(exit);
		
		w.setVisible(true); // Das Fenster wird 

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Start) {
			Spielfeld spielfeld = new Spielfeld();
			instance = new haupt();
		} else if (e.getSource() == regeln) {
			JOptionPane.showMessageDialog(null,
					"Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen l�sst, \n besetzt dieser den untersten freien Platz der Spalte. \n Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner \n Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen. Das Spiel endet unentschieden, \n wenn das Spielbrett komplett gef�llt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.",
					"Regeln", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Hallo");
		} else if (e.getSource() == exit) {
			System.exit(0);

		}
	}
}
