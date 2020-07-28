package DecksOfCards.Polish;

import java.util.Arrays;

public class BuildPolishDeck {

    public static void fillPolishDeckWithPolishCards (){
        PolishCard[] deckOfPolishCards = new PolishCard[52];
        int i = 0;
        for (PolishSuit polishSuit: PolishSuit.values()){
            for (PolishRank polishRank: PolishRank.values()){
                deckOfPolishCards[i] = new PolishCard(polishSuit, polishRank);
                i++;
            }
        }
        System.out.println(Arrays.toString(deckOfPolishCards));
    }
}
