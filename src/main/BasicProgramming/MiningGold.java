package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/CARRYGOLD">CARRY GOLD</a>
 * Chef has decided to go to a gold mine along with N of his friends (thus, total N+1 people including Chef go to the gold mine).
 * The gold mine contains a total of X kg of gold. Every person has the capacity of carrying up atmost Y kg of gold.
 * Will Chef and his friends together be able to carry up all the gold from the gold mine assuming that they can go to the mine exactly once.
 */
class MiningGold {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if ((arr[0] + 1) * arr[2] >= arr[1])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
