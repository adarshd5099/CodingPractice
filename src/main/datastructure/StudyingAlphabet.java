package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudyingAlphabet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> letters = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(Collectors.toList());
        int[] count = new int[26];
        Arrays.stream(br.readLine().split("")).forEach(c -> count[letters.indexOf(c)]++);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0)
            System.out.println(Arrays.stream(br.readLine().split("")).anyMatch(c -> count[letters.indexOf(c)] == 0) ? "No" : "Yes");
    }
}
