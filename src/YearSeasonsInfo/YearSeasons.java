package YearSeasonsInfo;

public enum YearSeasons {
    SPRING("wiosna", new Month[]{new Month("marzec"), new Month("kwiecień"), new Month("maj")}),
    SUMMER("lato", new Month[]{new Month("czerwiec"), new Month("lipiec"), new Month("sierpień")}),
    AUTUMN("jesień", new Month[]{new Month("wrzesień"), new Month("październik"), new Month("listopad")}),
    WINTER("zima", new Month[]{new Month("grudzień"), new Month("styczeń"), new Month("luty")});

    private final String season ;
    private final Month[] monthsOfASeason;

    YearSeasons(String season, Month[] monthsOfASeason) {
        this.season = season;
        this.monthsOfASeason = monthsOfASeason;
    }

    public Month[] getMonthsOfASeason() {
        return monthsOfASeason;
    }

    public String getSeason() {
        return season;
    }

    public static YearSeasons fromDescription (String season){
        YearSeasons[] values = values();
        for (YearSeasons yearSeasons: values){
            if (yearSeasons.getSeason().equals(season))
                return yearSeasons;
        }
        return null;
    }
}
