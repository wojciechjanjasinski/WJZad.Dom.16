package DecksOfCards.Polish;

public enum PolishSuit {
    TREFL('\u2663', "żołądź"),
    KARO('\u2666', "dzwonek"),
    KIER('\u2665', "serce"),
    PIK('\u2660', "wino");

    private final char suitSign;
    private final String polishAlternativeName;

    PolishSuit(char suitSign, String polishAlternativeName) {
        this.suitSign = suitSign;
        this.polishAlternativeName = polishAlternativeName;
    }

    public char getSuitSign() {
        return suitSign;
    }

    public String getPolishAlternativeName() {
        return polishAlternativeName;
    }

    @Override
    public String toString() {
        return "PolishSuit{" +
                "suitSign=" + suitSign +
                ", polishAlternativeName='" + polishAlternativeName + '\'' +
                "} " + super.toString();
    }
}
