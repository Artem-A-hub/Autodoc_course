package lessons.lesson13.enumExample;

public enum CountryCurrency {
    CANADA("CAD"),
    POLAND("ZLT"),
    UKRAINE("UAH"),
    GERMANY;

    String currency;

    CountryCurrency(String currency) {
        this.currency = currency;
    }

    CountryCurrency() {
    }

}
