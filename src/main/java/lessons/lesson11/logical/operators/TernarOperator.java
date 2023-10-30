package lessons.lesson11.logical.operators;

public class TernarOperator {

    public static void main(String[] args) {
        simpleOperator("How are you?");
        ternarOperator("How are you");
    }

    public static void ternarOperator(String str) {
        var lastChar = str.charAt(str.length() - 1);
        var result = lastChar == '?' ? "question" : "No question";
        System.out.println(result);
    }

    public static void simpleOperator(String str) {
        var lastChar = str.charAt(str.length() - 1);
        if (lastChar == '?') {
            System.out.println("question");
        } else {
            System.out.println("No question");
        }
    }
}
