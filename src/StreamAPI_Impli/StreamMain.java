package StreamAPI_Impli;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(2,3,4,52,6,36,4,65,63,4,5,6);

//        list1.add(33); //Immutable list
//        System.out.println(list1);
//        List<Integer> list2 = new ArrayList<>(); // mutable list
//        for(int i = 1; i < 10; i++) {
//            list1.add(i + 2);
//        }
//        System.out.println(list2);

//        List<Integer> list3 = Arrays.asList(3,4,5,63,4,5,6); // immutable


        System.out.println(list1);

        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(newList);

        List<Integer> newList2 = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
