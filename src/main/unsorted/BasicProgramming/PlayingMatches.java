package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class PlayingMatches {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] digit = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int sum = arr[0] + arr[1];
            int sticks = 0;
            while (sum > 0) {
                sticks += digit[sum % 10];
                sum = sum / 10;
            }
            System.out.println(sticks);
        }
    }

}
