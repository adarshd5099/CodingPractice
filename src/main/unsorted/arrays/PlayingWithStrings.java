package main.unsorted.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class PlayingWithStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            br.readLine();
            System.out.println(Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).sum() == Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).sum() ? "YES" : "NO");
        }
    }
}
