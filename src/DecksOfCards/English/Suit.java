package DecksOfCards.English;

public enum Suit {
    ClUBS( '\u2663'),
    DIAMONDS('\u2666'),
    HEARTS('\u2665'),
    SPADES('\u2660');

    private final char suitSign;

    Suit(char suitSign) {
        this.suitSign = suitSign;
    }

    public char getSuitSign() {
        return suitSign;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "suitSign=" + suitSign +
                "} " + super.toString();
    }
}
