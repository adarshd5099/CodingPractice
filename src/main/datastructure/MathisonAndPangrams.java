package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.codechef.com/problems/MATPAN
 */
class MathisonAndPangrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<String> letters = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(Collectors.toList());
        while (T-- > 0) {
            int[] count = new int[26];
            int sum = 0;
            int[] price = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.stream(br.readLine().split("")).forEach(c -> count[letters.indexOf(c)]++);
            for (int i = 0; i < 26; i++) {
                if (count[i] == 0) sum = sum + price[i];
            }
            System.out.println(sum);
        }
    }
}
