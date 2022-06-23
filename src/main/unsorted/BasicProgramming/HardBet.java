package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/HARDBET">https://www.codechef.com/problems/HARDBET</a>
 * There are 3 problems in a contest namely A,B,C respectively. Alice bets Bob that problem C is the hardest while Bob says that problem B
 * <p>
 * will be the hardest.
 * <p>
 * You are given three integers SA,SB,SC
 * which denotes the number of successful submissions of the problems A,B,C
 * <p>
 * respectively. It is guaranteed that each problem has a different number of submissions. Determine who wins the bet.
 * <p>
 * 1) If Alice wins the bet (i.e. problem C
 * is the hardest), then output Alice
 * <p>
 * .
 * <p>
 * 2) If Bob wins the bet (i.e. problem B
 * is the hardest), then output Bob
 * <p>
 * .
 * <p>
 * 3) If no one wins the bet (i.e. problem A
 * is the hardest), then output Draw
 * <p>
 * .
 * <p>
 * Note: The hardest problem is the problem with the least number of successful submissions.
 */
class HardBet {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] < arr[1]) {
                if (arr[0] < arr[2])
                    System.out.println("Draw");
                else
                    System.out.println("Alice");
            } else {
                if (arr[1] < arr[2])
                    System.out.println("Bob");
                else
                    System.out.println("Alice");
            }
        }
    }
}
