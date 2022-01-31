package hallo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command.equals("Start Game")) {
			System.out.println("Spiel startet...");
		}
		else if (command.equals("Regeln")) {
			System.out.println("Die Regeln werden angezeigt");
		}
		else if (command.equals("Exit Game")) {
			System.out.println("Spiel wurde beendet");
		}
	} 
}
