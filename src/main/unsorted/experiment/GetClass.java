package main.unsorted.experiment;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GetClass {
    public static void main(String[] args) throws NoSuchMethodException {
        var a = new Integer(1);
        var b = a.getClass();
        var c = b.getMethod("parseInt", String.class);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Arrays.stream("adarspartyadarparty".split("party")).collect(Collectors.toList()));
    }
}
