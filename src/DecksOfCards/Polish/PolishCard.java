package DecksOfCards.Polish;

public class PolishCard {
    PolishSuit polishSuit;
    PolishRank polishRank;

    public PolishCard(PolishSuit polishSuit, PolishRank polishRank) {
        this.polishSuit = polishSuit;
        this.polishRank = polishRank;
    }

    public PolishSuit getPolishSuit() {
        return polishSuit;
    }

    public void setPolishSuit(PolishSuit polishSuit) {
        this.polishSuit = polishSuit;
    }

    public PolishRank getPolishRank() {
        return polishRank;
    }

    public void setPolishRank(PolishRank polishRank) {
        this.polishRank = polishRank;
    }

    @Override
    public String toString() {
        return "PolishCard{" +
                "polishSuit=" + polishSuit +
                ", polishRank=" + polishRank +
                '}';
    }
}
