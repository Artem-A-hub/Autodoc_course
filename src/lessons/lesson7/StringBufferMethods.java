package lessons.lesson7;

import java.util.Arrays;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        StringBuffer stringBuffer2 = new StringBuffer("Alex - ");

        stringBuffer2.append(Integer.valueOf(2));
        stringBuffer2.append('\n');
        stringBuffer2.append("; ");
        stringBuffer2.append(false);
        stringBuffer2.append('C');
        stringBuffer2.append(Arrays.asList(1, 2, 3));

        System.out.println(stringBuffer2);
    }
}
