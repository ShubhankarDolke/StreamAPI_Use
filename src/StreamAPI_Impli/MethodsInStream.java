package StreamAPI_Impli;

import java.util.List;
import java.util.stream.Collectors;

public class MethodsInStream {
    public static void main(String[] args) {
        //filter(Predicate) returns true/fasle
        //boolean value function

        //map(function) returns value

        List<String> names = List.of("abc", "def", "aman", "abhinav");
        List<String> newNames = names.stream().filter(e -> e.startsWith("a")).collect(Collectors.toList());
        System.out.println(newNames);

        //map
        List<Integer> numbers = List.of(12,3,4,5,6);
        //map square
        List<Integer> newNumber = numbers.stream().map(e -> e * e).collect(Collectors.toList());

        System.out.println(newNumber);

        newNumber.stream().forEach(System.out::println);


        //sorted

        numbers.stream().sorted().forEach(System.out::println);

        //min num
        Integer minNumber = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("min " + minNumber);

        //max num
        Integer maxNumber = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("max " + maxNumber);

    }
}
