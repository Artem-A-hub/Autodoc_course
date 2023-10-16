package lessons.lesson5;

public class StringMethods {
    public static void main(String[] args) {
        lengthMethod();
        concatMethod();
        trimMethod();
        endsWithMethod();
        caseMethods();
        equalsMethods();
        containsMethods();
        charAtMethods();
        toCharArrayMethods();
        indexOfMethods();
        substringMethods();
        replaceMethods();
    }

    public static void replaceMethods() {
        String str = "My name is Alex";
        String replacedStr = str.replace("Alex", "Max");
        System.out.println(replacedStr);
    }
    public static void substringMethods() {
        String str = "My name is Alex";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0, 7));
    }

    public static void indexOfMethods() {
        String str = "My name is Alex";
        System.out.println(str.indexOf('M'));
        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf("Alex"));
        System.out.println(str.indexOf("sdvwdv"));
    }

    public static void toCharArrayMethods() {
        String str = "My name is Alex";
        char[] result = str.toCharArray();

        for (Character r : result) {
            System.out.print(r + " ");
        }
        System.out.println();
    }

    public static void charAtMethods() {
        String str = "My name is Alex";
        char result = str.charAt(4);
        System.out.println(result);
    }

    public static void containsMethods() {
        String str = "My name is Alex";
        String str2 = "Alex";
        boolean resultOfContains = str.contains(str2);
        System.out.println(resultOfContains);
    }

    public static void equalsMethods() {
        String str = "My name is Alex";
        String str2 = "My name is Alex";
        boolean resultOfCompare = str.equals(str2);
        System.out.println(resultOfCompare);
    }

    public static void caseMethods() {
        String str = "My Name Is Alex";
        String toUpper = str.toUpperCase();
        String toLower = str.toLowerCase();

        System.out.println(toUpper);
        System.out.println(toLower);
    }

    public static void endsWithMethod() {
        String str = "My name is Alex";
        boolean ends1 = str.endsWith("Alex");
        boolean ends2 = str.endsWith("Maks");

        System.out.println(ends1);
        System.out.println(ends2);
    }

    public static void trimMethod() {
        String str = "    My name is Alex   ";
        String str2 = "    My name is Alex   ";
        System.out.println(str.trim());
        System.out.println(str2);
    }

    public static void concatMethod() {
        String text1 = "Hello ";
        String text2 = "world";
        String result = text1.concat(text2);
        System.out.println(result);
    }

    public static void lengthMethod() {
        String name = "Alex Alex";
        System.out.println(name.length());
    }
}
