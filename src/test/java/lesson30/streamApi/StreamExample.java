package lesson30.streamApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");

        for (String e : list) {
//            System.out.println(e);
        }

        Stream<String> stream = list.stream();
//        stream.forEach(System.out::println);

        Set<String> stringSet = list.stream().collect(Collectors.toSet());
//        stringSet.forEach(System.out::println);

        Set<String> filterSet = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());
//        filterSet.forEach(System.out::println);

        List<String> upperList = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        upperList.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("one", "two");

        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("one");
        list1.add("two");
        list1.add("two");

        List<String> list2 = new ArrayList<>();
        list2.add("three");
        list2.add("three");
        list2.add("four");
        list2.add("four");

        Set<List<String>> stringSet1 = Stream.of(List.of(list1), List.of(list2))
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
//        stringSet1.forEach(System.out::println);

        Set<String> stringSet2 = Stream.of(list1, list2)
                .flatMap(List::stream)
                .collect(Collectors.toSet());

//        stringSet2.forEach(System.out::println);

//        reducing();

        int streamReducing =  Stream.of(1,2,3).reduce(10, (count, element)-> count + element);
//        System.out.println(streamReducing);

        Stream.of("one", "two").sorted();
        Stream.of("one", "two").limit(1);
        Stream.of("one", "two", "two").distinct();
        Stream.of("one", "two").skip(1);


    }

    public static void reducing() {
        int count = 0;
        int[] arr = {1, 2, 3};
        for (int a : arr) {
            count += a;
        }
        System.out.println(count);
    }
}