package YearSeasonsInfo;

import java.util.Arrays;

public class InfoYearSeasons {
    public static void main(String[] args) {
        System.out.println("Wpisz proszę po polsku porę roku o której chcesz uzyskać informacje:");
        YearSeasons yearSeasons = FromUserSeasonScanner.getYearSeasonsUserChoice();
        if (yearSeasons == null) throw new AssertionError();
        System.out.println("Wybrałeś następującą porę roku: " + yearSeasons.getSeason());
        System.out.println("Do tej pory roku: " + yearSeasons.getSeason() + " zaliczamy następujące miesiące "
                + Arrays.toString(yearSeasons.getMonthsOfASeason()));
    }

}
