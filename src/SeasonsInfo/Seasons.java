package SeasonsInfo;

import java.io.Serializable;

import static SeasonsInfo.Month.*;

public enum Seasons {
    SPRING("wiosna", MARZEC, KWIECIEN, MAJ),
    SUMMER("lato", CZERWIEC, LIPIEC, SIERPIEN),
    AUTUMN("jesień", WRZESIEN, PAZDZIERNIK, LISTOPAD),
    WINTER("zima", GRUDZIEN, STYCZEN, LUTY);

    private final String season;
    private final Month firstMonth;
    private final Month secondMonth;
    private final Month thirdMonth;

    Seasons(String season, Month firstMonth, Month secondMonth, Month thirdMonth) {
        this.season = season;
        this.firstMonth = firstMonth;
        this.secondMonth = secondMonth;
        this.thirdMonth = thirdMonth;
    }

    public Month getFirstMonth() {
        return firstMonth;
    }

    public Month getSecondMonth() {
        return secondMonth;
    }

    public Month getThirdMonth() {
        return thirdMonth;
    }

    public String getSeason() {
        return season;
    }

    public static Serializable fromDescription(String season) {
        Seasons[] values = values();
        for (Seasons seasons : values) {
            if (seasons.getSeason().equals(season)) {
                return seasons;
            } else
                return new IllegalArgumentException("podałeś nieprawidłową wartość. Niestety nie mogę wyświetlić informacji");
        }
        return null;
    }
}
