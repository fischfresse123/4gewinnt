package hallo;



import javax.swing.JFrame;

import javax.swing.JLabel;



public class haupt {



	public static void main(String[] args) {

		System.out.println("Hallo die zweite");

		System.out.println("hallo");

		System.out.println(

				"  1   2   3   4   5   6   7\n  v   v   v   v   v   v   v\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|");

		JFrame fenster = new JFrame("4Gewinnt");

		fenster.setSize(600, 400);

		fenster.setVisible(true);

		fenster.add(new JLabel(

				"  1   2   3   4   5   6   7\n  v   v   v   v   v   v   v\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|\n|   |   |   |   |   |   |   |\n|———————————————————————————|"));

		fenster.add(new JLabel("  v   v   v   v   v   v   v"));

	}



	public static boolean abfrage(int z) {

		for (int x = 0; x < 7; x++) {

			for (int y = 0; y < 6; y++) {



			}

		}

		boolean hallo = true;

		return hallo;

		

	}



}
