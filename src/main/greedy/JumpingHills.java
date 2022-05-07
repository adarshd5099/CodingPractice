package main.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class JumpingHills {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int parachute = 1, i;
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] hills = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (i = 0; i < arr[0] - 1; i++) {
                int heightDifference = Math.abs(hills[i] - hills[i + 1]);
                if (hills[i] == hills[i + 1]) ;
                else if (hills[i] < hills[i + 1] && heightDifference <= arr[1]) ;
                else if (hills[i] > hills[i + 1] && (heightDifference <= arr[2] || parachute-- > 0)) ;
                else break;
            }
            System.out.println(i + 1);
        }
    }
}
