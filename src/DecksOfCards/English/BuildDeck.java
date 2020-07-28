package DecksOfCards.English;

import java.util.Arrays;

public class BuildDeck {

    public static void fillDeckWithCards (){
        Card[] deckOfCards = new Card[52];
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
