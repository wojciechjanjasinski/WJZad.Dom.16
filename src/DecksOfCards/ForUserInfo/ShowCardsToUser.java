package DecksOfCards.ForUserInfo;

import java.util.Scanner;

import static DecksOfCards.English.BuildDeck.fillDeckWithCards;
import static DecksOfCards.Polish.BuildPolishDeck.fillPolishDeckWithPolishCards;

public class ShowCardsToUser {
    public static void getInfoFromUserAboutDecksToShow(){
        System.out.println("Szanowny Użytkowniku! Mogę wyświetlić talię kart w języku angielskim lub języku polskim. …");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aby wybrać polską talię kart wpisz \"PL\" aby angielską pisz \"GB\" ");
        String userDeckChoice = scanner.nextLine();
        System.out.println("wybrałeś:" + userDeckChoice);
        String polishDeckChoice = "PL";
        String englishDeckChoice = "GB";
        boolean choicePolishDeck = userDeckChoice.equals(polishDeckChoice);
        boolean choiceEnglishDeck = userDeckChoice.equals(englishDeckChoice);
        do {
            if (choicePolishDeck) {
                fillPolishDeckWithPolishCards();
                scanner.close();
            } else System.out.println("wprowadziłeś niepoprawną informację, nie mogę wyświetlić informacji o talii");
            if (choiceEnglishDeck) {
                fillDeckWithCards();
                scanner.close();
            } else System.out.println("wprowadziłeś niepoprawną informację, nie mogę wyświetlić informacji o talii");
        } while (!choicePolishDeck && !choiceEnglishDeck);

//        if (userDeckChoice.equals(polishDeckChoice)){
//            fillPolishDeckWithPolishCards ();
//        } else System.out.println("Niestety nie wprowadziłeś poprawnej informacji nie mogę wyświętlić informacji");
//        if (userDeckChoice.equals(englishDeckChoice)){
//            fillDeckWithCards ();
//        } else System.out.println("Niestety nie wprowadziłeś poprawnej informacji nie mogę wyświętlić informacji");

    }
}
