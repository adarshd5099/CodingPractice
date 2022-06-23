package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/FRGAME">FRGAME</a>
 * Nitin and Sobhagya were playing a game with coins. If Sobhagya has more coins then he is winning, otherwise Nitin is winning. Note that this means if both Nitin and Sobhagya have the same number of coins, then Nitin is winning.
 * <p>
 * Initially Nitin has A coins while Sobhagya has B coins. Then Ritik came and gave his C coins to the player who is not winning currently, after which Satyarth came and repeated the same process (gave his D
 * <p>
 * coins to the player who is not winning currently).
 * <p>
 * Find the final winner of the game.
 */
class GameBetweenFriends {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] >= arr[1])
                arr[1] += arr[2];
            else
                arr[0] += arr[2];
            if (arr[0] >= arr[1])
                arr[1] += arr[3];
            else
                arr[0] += arr[3];
            if (arr[0] >= arr[1])
                System.out.println("N");
            else
                System.out.println("S");

        }
    }
}
