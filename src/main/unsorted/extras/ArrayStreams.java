package main.unsorted.extras;

import java.util.Arrays;

public class ArrayStreams {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        Arrays.stream(arr).forEach(a->{
//            System.out.println(a);
//        });

        Arrays.stream(arr)
                .map(c -> c * 3)
                .forEach(c -> System.out.println(c));
    }
}
