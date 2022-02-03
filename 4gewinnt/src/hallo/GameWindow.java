package hallo;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame {
	
    public GameWindow(int width, int height) {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("viergewinnticon.png")));
        setTitle("4Gewinnt");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds (0, 0, width, height);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        Spielfeld gamePanel = new Spielfeld();
        getContentPane().add(gamePanel, BorderLayout.CENTER);

        setVisible(true);

}
}