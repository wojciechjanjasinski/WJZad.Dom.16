package DecksOfCards.English;

public enum Rank {
    ACE("As", "Ace"),
    TWO("Dwa", "Two"),
    THREE("Trzy", "Three"),
    FOUR("Cztery", "Four"),
    FIVE("Pięć", "Five"),
    SIX("Sześć", "Six"),
    SEVEN("Siedem", "Seven"),
    EIGHT("Osiem", "Eight"),
    NINE("Dziewięć", "Nine"),
    TEN("Dziesięć", "Ten"),
    JACK("Walet", "Jack"),
    QUEEN("Królowa", "Queen"),
    KING("Król", "King");

    private final String polishDescription;
    private final String englishDescription;

    Rank(String polishDescription, String englishDescription) {
        this.polishDescription = polishDescription;
        this.englishDescription = englishDescription;
    }

    public String getPolishDescription() {
        return polishDescription;
    }

    public String getEnglishDescription() {
        return englishDescription;
    }


    @Override
    public String toString() {
        return "Rank{" +
                "polishDescription='" + polishDescription + '\'' +
                ", englishDescription='" + englishDescription + '\'' +
                "} " + super.toString();
    }
}
