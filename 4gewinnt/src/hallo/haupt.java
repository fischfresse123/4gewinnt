package hallo;

import java.util.ArrayList;

public class haupt {
	private FeldValue aktuellerSpieler;
	private ArrayList<Feld> fields;

	public static void main(String[] args) {
		Controller menu = new Controller();
	}

	public haupt() {
		new GameWindow(800, 1000);
		initGame();
	}

	private void initGame() {
		// Spiel Objekte
		// Spieler
		aktuellerSpieler = FeldValue.O;
		// Felder
		int fieldsMarginLeft = 17;
		int fieldsMarginTop = 60;
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

	public void nächsterSpieler() {
		if (aktuellerSpieler == FeldValue.X) {
			aktuellerSpieler = FeldValue.O;
		} else {
			aktuellerSpieler = FeldValue.X;
		}
	}

	public FeldValue getAktuellerSpieler() {
		return aktuellerSpieler;

	}

	public ArrayList<Feld> getFields() {
		return fields;
	}

	public boolean Gewonnen() {
		int[][] FeldArray = new int[7][6];

		FeldArray[0][0] = fields.get(0).getValue().getValue();
		FeldArray[1][0] = fields.get(1).getValue().getValue();
		FeldArray[2][0] = fields.get(2).getValue().getValue();
		FeldArray[3][0] = fields.get(3).getValue().getValue();
		FeldArray[4][0] = fields.get(4).getValue().getValue();
		FeldArray[5][0] = fields.get(5).getValue().getValue();
		FeldArray[6][0] = fields.get(6).getValue().getValue();
		FeldArray[0][1] = fields.get(7).getValue().getValue();
		FeldArray[1][1] = fields.get(8).getValue().getValue();
		FeldArray[2][1] = fields.get(9).getValue().getValue();
		FeldArray[3][1] = fields.get(10).getValue().getValue();
		FeldArray[4][1] = fields.get(11).getValue().getValue();
		FeldArray[5][1] = fields.get(12).getValue().getValue();
		FeldArray[6][1] = fields.get(13).getValue().getValue();
		FeldArray[0][2] = fields.get(14).getValue().getValue();
		FeldArray[1][2] = fields.get(15).getValue().getValue();
		FeldArray[2][2] = fields.get(16).getValue().getValue();
		FeldArray[3][2] = fields.get(17).getValue().getValue();
		FeldArray[4][2] = fields.get(18).getValue().getValue();
		FeldArray[5][2] = fields.get(19).getValue().getValue();
		FeldArray[6][2] = fields.get(20).getValue().getValue();
		FeldArray[0][3] = fields.get(21).getValue().getValue();
		FeldArray[1][3] = fields.get(22).getValue().getValue();
		FeldArray[2][3] = fields.get(23).getValue().getValue();
		FeldArray[3][3] = fields.get(24).getValue().getValue();
		FeldArray[4][3] = fields.get(25).getValue().getValue();
		FeldArray[5][3] = fields.get(26).getValue().getValue();
		FeldArray[6][3] = fields.get(27).getValue().getValue();
		FeldArray[0][4] = fields.get(28).getValue().getValue();
		FeldArray[1][4] = fields.get(29).getValue().getValue();
		FeldArray[2][4] = fields.get(30).getValue().getValue();
		FeldArray[3][4] = fields.get(31).getValue().getValue();
		FeldArray[4][4] = fields.get(32).getValue().getValue();
		FeldArray[5][4] = fields.get(33).getValue().getValue();
		FeldArray[6][4] = fields.get(34).getValue().getValue();
		FeldArray[0][5] = fields.get(35).getValue().getValue();
		FeldArray[1][5] = fields.get(36).getValue().getValue();
		FeldArray[2][5] = fields.get(37).getValue().getValue();
		FeldArray[3][5] = fields.get(38).getValue().getValue();
		FeldArray[4][5] = fields.get(39).getValue().getValue();
		FeldArray[5][5] = fields.get(40).getValue().getValue();
		FeldArray[6][5] = fields.get(41).getValue().getValue();
	}
}
