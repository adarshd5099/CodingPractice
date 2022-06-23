package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/NAICHEF">NAIVE CHEF</a>
 * Once, after a stressful day, Chef decided to relax and visit a casino near his house to gamble. He feels lucky and he's going to bet almost all of his money.
 * <p>
 * The game Chef is going to play in the casino consists of tossing a die with N
 * faces twice. There is a number written on each face of the die (these numbers are not necessarily distinct). In order to win, Chef must get the number A on the first toss and the number B
 * <p>
 * on the second toss of the die.
 * <p>
 * The excited viewers want to know the probability that Chef will win the game. Can you help them find that number? Assume that Chef gets each face of the die with the same probability on each toss and that tosses are mutually independent.
 */
class NaiveChef {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] count = new int[100000];
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] z = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int f : z) {
                count[f]++;
            }
            Double a = count[arr[1]] / Double.valueOf(arr[0]);
            Double b = count[arr[2]] / Double.valueOf(arr[0]);
            System.out.println(a * b);
        }
    }
}
