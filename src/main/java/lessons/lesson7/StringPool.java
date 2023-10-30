package lessons.lesson7;

public class StringPool {

    public static void main(String[] args) {
        String name = "Alex";
        String name2 = "Alex";

        String name3 = new String("Alex").intern();
        String name4 = new String("Alex").intern();

        System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name == name4);


        String str = "Hello World".toUpperCase().concat(" Alex");
    }
}
