package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/submit/SUBTASK
 */
class ASubtaskProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] testCases = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (Arrays.stream(testCases).sum() == arr[0])
                System.out.println("100");
            else if (Arrays.stream(testCases).limit(arr[1]).sum() == arr[1])
                System.out.println(arr[2]);
            else System.out.println("0");
        }
    }
}
