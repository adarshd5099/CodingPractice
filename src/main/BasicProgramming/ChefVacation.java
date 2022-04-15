package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/CHEFVACATION">CHEF VACATION</a>
 * After a very long time, the Chef has a vacation. Chef has planned for two trips during this vacation - one with his family and the other with his friends. The family trip will take X days and the trip with friends will take Y days. Currently, the dates are not decided but the vacation will last only for Z days.
 * Chef can be in at most one trip at any time and once a trip is started, Chef must complete it before the vacation ends. Will Chef be able to go on both these trips if he chooses the dates optimally?
 */
class ChefVacation {
    public static void main(String[] args) throws IOException {
        int T, a, b, result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] + arr[1] <= arr[2])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
