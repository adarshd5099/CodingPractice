package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class PenaltyShots {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int first = 0, second = 0;
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) first += arr[i];
                else second += arr[i];
            }
            if (first > second) System.out.println("1");
            else if (first < second) System.out.println("2");
            else System.out.println("0");
        }
    }
}
