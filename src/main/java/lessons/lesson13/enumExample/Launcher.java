package lessons.lesson13.enumExample;

public class Launcher {

    public static void main(String[] args) {

        String res = gettingCurrency(CountryCurrency.CANADA);
        System.out.println(res);
    }


    public static String gettingCurrency(CountryCurrency countryCurrency) {
        String result = null;
        for (CountryCurrency cc : CountryCurrency.values()) {
            if (cc.equals(countryCurrency)) {
                result = cc.currency;
                break;
            }
        }
        return result;
    }


    public static void enumWithConstructor() {
        for (CountryCurrency cc : CountryCurrency.values()) {
            System.out.println(cc + " country currency " + cc.currency);
        }
    }

    public static void enumValuesAndNameMethod() {
        for (Car c : Car.values()) {
            System.out.println("method name " + c.name());
            System.out.println(c);
        }
    }

    public static void enumCall() {
        System.out.println(Car.BMW);
    }
}
