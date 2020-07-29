package SeasonsInfo;

import java.util.Scanner;

public class FromUserSeasonScanner {
    public static Seasons getYearSeasonsUserChoice() {
        Scanner scanner = new Scanner(System.in);
        String fromUserSeasonName = scanner.nextLine();
        return (Seasons) Seasons.fromDescription(fromUserSeasonName);
    }
}
