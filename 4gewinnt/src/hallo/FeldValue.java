package hallo;

public enum FeldValue {
	
	X(1), O(2), EMPTY(0);

    int value;

    private FeldValue(int Wert) {
        value = Wert;
    }


    int getValue() {
        return value;
    }
}