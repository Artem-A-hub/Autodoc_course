package lessons.lesson14.innerclasses;

public class LocalInnerClassMethod {

    int outerSum = 5;

    void someMethodOfOuterClass() {
        int sum = 16;
        class LocalMethodClass {
            public void print() {
                System.out.println(sum);
                System.out.println(outerSum);
            }
        }
        LocalMethodClass localMethodClass = new LocalMethodClass();
        localMethodClass.print();
    }
}
