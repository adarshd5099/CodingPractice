package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class MakingAMeal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<String> letters = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(Collectors.toList());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] count = new int[26];
            StringBuilder s = new StringBuilder();
            while (n-- > 0) s.append(br.readLine());
            System.out.println(Collections.min(Arrays.asList((Arrays.stream(s.toString().split("")).filter(c -> c.equals("c")).count()) / 2,
                    Arrays.stream(s.toString().split("")).filter(c -> c.equals("o")).count(),
                    Arrays.stream(s.toString().split("")).filter(c -> c.equals("d")).count(),
                    (Arrays.stream(s.toString().split("")).filter(c -> c.equals("e")).count()) / 2,
                    Arrays.stream(s.toString().split("")).filter(c -> c.equals("h")).count(),
                    Arrays.stream(s.toString().split("")).filter(c -> c.equals("f")).count())));
        }
    }

}
