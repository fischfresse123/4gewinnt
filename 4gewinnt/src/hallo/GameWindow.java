package hallo;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

    public GameWindow(int width, int height) {

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