package StreamAPI_Impli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {


    //  Stream API - collection process

    //  collection / group of object

       // 1- blank stream

        Stream<Object> emptyStream = Stream.empty();
//        emptyStream.forEach(e -> {
//            System.out.println(e);
//        });

        String [] names = {"ABC", "CRV", "EVVE", "CFS" };
        // 2- array, object collection
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        // 3-
        Stream<Object> StreamBuilder = Stream.builder().build();

        //4
         IntStream stream =Arrays.stream(new int[] {1,2,3,4,56,67,7});

         stream.forEach(e -> {
             System.out.println(e);
         });

         //5 list, set

        List<Integer> listNew = new ArrayList<>();
        for(int i = 1; i < 12; i++) {
            listNew.add(i *2);
        }

        Stream<Integer> stream3 = listNew.stream();

        stream3.forEach(e -> {
            System.out.println(e);
        });









    }
}
