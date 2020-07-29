package DecksOfCards.English;

import java.util.Arrays;

public class BuildDeck {
    public static final int MAXIMUM_CARD_NUMBER_VALUE = 52;
    public static void fillDeckWithCards (){
        Card[] deckOfCards = new Card[MAXIMUM_CARD_NUMBER_VALUE];
        int i = 0;
        for (Suit suit: Suit.values()){
            for (Rank rank: Rank.values()){
                deckOfCards[i] = new Card(suit, rank);
                i++;
            }
        }
        System.out.println(Arrays.toString(deckOfCards));
    }
}
