package YearSeasonsInfo;

import java.util.Scanner;

public class FromUserSeasonScanner {
    public static YearSeasons getYearSeasonsUserChoice() {
        Scanner scanner = new Scanner(System.in);
        String fromUserSeasonName = scanner.nextLine();
        return YearSeasons.fromDescription(fromUserSeasonName);
    }
}
