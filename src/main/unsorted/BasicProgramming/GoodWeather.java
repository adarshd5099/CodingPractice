package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class GoodWeather {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] count = new int[2];
            Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(c -> count[c]++);
            String result = count[1] > count[0] ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
