package hallo;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		if (command.equals("Start Game")) {
			System.out.println("Spiel startet...");
		} else if (command.equals("Regeln")) {
			JOptionPane.showMessageDialog(null,"Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen lässt, \n besetzt dieser den untersten freien Platz der Spalte. \n Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner \n Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen. Das Spiel endet unentschieden, \n wenn das Spielbrett komplett gefüllt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.");
			System.out.println("Die Regeln werden angezeigt");
		} else if (command.equals("Exit Game")) {
			System.exit(0);

		}
	}
}
