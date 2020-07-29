package SeasonsInfo;

public class InfoSeasons {
    public static void main(String[] args) {
        System.out.println("Wpisz proszę po polsku porę roku o której chcesz uzyskać informacje:");
        Seasons seasons = FromUserSeasonScanner.getYearSeasonsUserChoice();
        System.out.println("Wybrałeś następującą porę roku: " + seasons.getSeason());
        System.out.println("Do tej pory roku: " + seasons.getSeason() + " zaliczamy następujące miesiące: " + seasons.getFirstMonth() + " " + seasons.getSecondMonth() + " " + seasons.getThirdMonth());
    }

}
