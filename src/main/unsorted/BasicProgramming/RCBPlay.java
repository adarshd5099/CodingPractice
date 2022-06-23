package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/problems/RCBPLAY
 * Team RCB has earned X points in the games it has played so far in this year's IPL. To qualify for the playoffs they must earn at least a total of Y points. They currently have Z games left, in each game they earn 2 points for a win, 1
 * <p>
 * point for a draw, and no points for a loss.
 * <p>
 * Is it possible for RCB to qualify for the playoffs this year?
 */
class RCBPlay {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (Math.max(0, (arr[1] - arr[0])) <= arr[2] * 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
