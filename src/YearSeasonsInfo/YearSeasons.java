package YearSeasonsInfo;

public enum YearSeasons {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[]{"grudzień", "styczeń", "luty"});

    private final String season ;
    private final String[] monthsOfASeason;

    YearSeasons(String season, String[] monthsOfASeason) {
        this.season = season;
        this.monthsOfASeason = monthsOfASeason;
    }

    public String[] getMonthsOfASeason() {
        return monthsOfASeason;
    }

    public String getSeason() {
        return season;
    }
}
