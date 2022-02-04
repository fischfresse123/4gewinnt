package hallo;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// Siehe haupt

public class GameWindow extends JFrame { // Durch das extends JFrame wird automatisch ein Fenster mit dem Namen der Klasse erstellt

	public GameWindow(int width, int height) {
		// setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("viergewinnticon.png"))); // Hier wird das Bild in der oberen linken Ecke und auf der Taskleiste geändert (Quelle: https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/NYCS-bull-trans-4-red.svg/2048px-NYCS-bull-trans-4-red.svg.png)
		setTitle("VIER GEWINNT"); // Das neue Fenster bekommt den Titel 4Gewinnt
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Wenn das rote Kreuz gedrückt wird, dann schließt sich nur dieses Fenster, man sieht aber wieder das Menu
		setBounds(0, 0, width, height); // Falls man die Boundries ändern will, dann ist das hier der Platzhalter dafür
		setLocationRelativeTo(null); // Das Fenster wird in der mitte des Bildschirms geöffnet
		setResizable(false); // Man kann die Größe des Fensters nun nicht mehr verändern
		setLayout(new BorderLayout()); // Hiermit kann das Fenster mit Layouts beschrieben werden

		Spielfeld gamePanel = new Spielfeld(); // Hiermit wird das JPanel Spielfeld in diese Klasse geholt und erhält den Namen gamePanel
		getContentPane().add(gamePanel, BorderLayout.CENTER); // Hiermit wird das JPanel dem Fenster hinzugefügt

		setVisible(true); // Das Fenster ist nun sichtbar

	}
}