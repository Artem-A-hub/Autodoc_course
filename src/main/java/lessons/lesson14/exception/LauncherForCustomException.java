package lessons.lesson14.exception;

public class LauncherForCustomException {
    public static void main(String[] args)  {
        try {
            compute(11);
        } catch (CustomException e) {
            System.err.println(e);
        }
    }

    public static void compute(int number) throws CustomException {
        System.out.println("compute метод вызван");
        if (number > 10) {
            throw new CustomException(number, "Some message about exception");
        }
        System.out.println("Нормально завершение метода");
    }
}
