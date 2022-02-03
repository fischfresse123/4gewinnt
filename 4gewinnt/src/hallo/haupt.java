package hallo;

import java.util.ArrayList;

public class haupt {
	private ArrayList<Feld> fields;
	
	//public static haupt instance;

	public static void main(String[] args) {
		Controller menu = new Controller();
		//instance = new haupt();
	}

	public haupt() {
		new GameWindow(800, 1000);
		initGame();
	}

	private void initGame() {
		// Spiel Objekte
		// Felder
		int fieldsMarginLeft = 17;
		int fieldsMarginTop = 205;
		int fieldsWidth = 750 / 7;
		int fieldsHeight = 642 / 6;

		fields = new ArrayList<Feld>();
		fields.add(new Feld(fieldsMarginLeft + 0, fieldsMarginTop + 0, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 1 * fieldsWidth, fieldsMarginTop + 0, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 2 * fieldsWidth, fieldsMarginTop + 0, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 3 * fieldsWidth, fieldsMarginTop + 0, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 4 * fieldsWidth, fieldsMarginTop + 0, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 5 * fieldsWidth, fieldsMarginTop + 0, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 6 * fieldsWidth, fieldsMarginTop + 0, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 0, fieldsMarginTop + 1 * fieldsHeight, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 1 * fieldsWidth, fieldsMarginTop + 1 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 2 * fieldsWidth, fieldsMarginTop + 1 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 3 * fieldsWidth, fieldsMarginTop + 1 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 4 * fieldsWidth, fieldsMarginTop + 1 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 5 * fieldsWidth, fieldsMarginTop + 1 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 6 * fieldsWidth, fieldsMarginTop + 1 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 0, fieldsMarginTop + 2 * fieldsHeight, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 1 * fieldsWidth, fieldsMarginTop + 2 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 2 * fieldsWidth, fieldsMarginTop + 2 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 3 * fieldsWidth, fieldsMarginTop + 2 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 4 * fieldsWidth, fieldsMarginTop + 2 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 5 * fieldsWidth, fieldsMarginTop + 2 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 6 * fieldsWidth, fieldsMarginTop + 2 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 0, fieldsMarginTop + 3 * fieldsHeight, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 1 * fieldsWidth, fieldsMarginTop + 3 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 2 * fieldsWidth, fieldsMarginTop + 3 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 3 * fieldsWidth, fieldsMarginTop + 3 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 4 * fieldsWidth, fieldsMarginTop + 3 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 5 * fieldsWidth, fieldsMarginTop + 3 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 6 * fieldsWidth, fieldsMarginTop + 3 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 0, fieldsMarginTop + 4 * fieldsHeight, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 1 * fieldsWidth, fieldsMarginTop + 4 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 2 * fieldsWidth, fieldsMarginTop + 4 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 3 * fieldsWidth, fieldsMarginTop + 4 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 4 * fieldsWidth, fieldsMarginTop + 4 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 5 * fieldsWidth, fieldsMarginTop + 4 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 6 * fieldsWidth, fieldsMarginTop + 4 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 0, fieldsMarginTop + 5 * fieldsHeight, fieldsWidth, fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 1 * fieldsWidth, fieldsMarginTop + 5 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 2 * fieldsWidth, fieldsMarginTop + 5 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 3 * fieldsWidth, fieldsMarginTop + 5 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 4 * fieldsWidth, fieldsMarginTop + 5 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 5 * fieldsWidth, fieldsMarginTop + 5 * fieldsHeight, fieldsWidth,
				fieldsHeight));
		fields.add(new Feld(fieldsMarginLeft + 6 * fieldsWidth, fieldsMarginTop + 5 * fieldsHeight, fieldsWidth,
				fieldsHeight));

	}

	public ArrayList<Feld> getFields() {
		return fields;
	}
}
