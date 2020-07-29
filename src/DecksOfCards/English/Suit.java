package DecksOfCards.English;

public enum Suit {
    ClUBS( '\u2663', "Trefl", "Clubs"),
    DIAMONDS('\u2666', "Karo", "Diamonds"),
    HEARTS('\u2665', "Kier", "Hearts"),
    SPADES('\u2660', "Pik", "Spades");

    private final char suitSign;
    private final String polishDescription;
    private final String englishDescription;

    Suit(char suitSign, String polishDescription, String englishDescription) {
        this.suitSign = suitSign;
        this.polishDescription = polishDescription;
        this.englishDescription = englishDescription;
    }

    public char getSuitSign() {
        return suitSign;
    }

    public String getPolishDescription() {
        return polishDescription;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "suitSign=" + suitSign +
                ", polishDescription='" + polishDescription + '\'' +
                ", englishDescription='" + englishDescription + '\'' +
                "} " + super.toString();
    }
}
