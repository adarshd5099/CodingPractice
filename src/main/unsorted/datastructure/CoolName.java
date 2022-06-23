package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CoolName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        List<String> letters = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(Collectors.toList());
        while (t-- > 0) {
            int sum = 0;
            String[] name = Arrays.stream(br.readLine().split("")).sorted().toArray(String[]::new);
            for (int i = 0; i < name.length; i++) {
                sum += (i + 1) * (letters.indexOf(name[i]) + 1);
            }
            System.out.println(sum);
        }
    }
}
