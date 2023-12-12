package lesson30.predicateExample;

@FunctionalInterface
public interface MyPredicate {
    boolean test(Integer value);
}