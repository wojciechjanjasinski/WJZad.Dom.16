package DecksOfCards.ForUserInfo;

import java.util.Scanner;

import static DecksOfCards.English.BuildDeck.fillDeckWithCards;
import static DecksOfCards.Polish.BuildPolishDeck.fillPolishDeckWithPolishCards;

public class ShowCardsToUser {
    private static String chooseLanguageDescription;

    public String getChooseLanguageDescription() {
        return chooseLanguageDescription;
    }

    public static void getInfoFromUserAboutDecksToShow() {
        boolean choicePolishDeck;
        boolean choiceEnglishDeck;
        do {
            System.out.println("Szanowny Użytkowniku! Mogę wyświetlić talię kart w języku angielskim lub języku polskim. …");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Aby wybrać polską talię kart wpisz \"PL\" aby angielską pisz \"GB\" ");
            String userDeckChoice = scanner.nextLine();
            System.out.println("wybrałeś:" + userDeckChoice);
            String polishDeckChoice = "PL";
            String englishDeckChoice = "GB";
            choicePolishDeck = userDeckChoice.equals(polishDeckChoice);
            choiceEnglishDeck = userDeckChoice.equals(englishDeckChoice);
            if (choicePolishDeck) {
                fillPolishDeckWithPolishCards();
                scanner.close();
            }
            if (choiceEnglishDeck) {
                fillDeckWithCards();
                scanner.close();
            }
        } while (!choicePolishDeck && !choiceEnglishDeck);
    }
}
