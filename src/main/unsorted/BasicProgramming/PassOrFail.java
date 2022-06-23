package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/PASSORFAIL">https://www.codechef.com/problems/PASSORFAIL</a>
 * Chef is struggling to pass a certain college course.
 * <p>
 * The test has a total of N
 * question, each question carries 3 marks for a correct answer and −1 for an incorrect answer. Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got X questions correct and the rest of them incorrect. For Chef to pass the course he must score at least P
 * <p>
 * marks.
 * <p>
 * Will Chef be able to pass the exam or not?
 */
class PassOrFail {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[1] * 3 - (arr[0] - arr[1]) >= arr[2])
                System.out.println("PASS");
            else
                System.out.println("FAIL");
        }
    }
}
