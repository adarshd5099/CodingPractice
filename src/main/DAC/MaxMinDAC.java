package main.DAC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Finding Max and Min element from in an array using Divide and Conquer
 */
public class MaxMinDAC {
    private static int[] maxMinDac(int[] a, int i, int j) {
        int min, max;
        if (i == j) {
            min = max = a[i];
            return new int[]{max, min};
        } else if (i == j - 1) {
            if (a[i] > a[j]) {
                max = a[i];
                min = a[j];
            } else {
                max = a[j];
                min = a[i];
            }
            return new int[]{max, min};
        } else {
            int mid = (i + j) / 2;
            int[] subProblemOneSolution = maxMinDac(a, i, mid);
            int[] subProblemTwoSolution = maxMinDac(a, mid + 1, j);
            max = Math.max(subProblemOneSolution[0], subProblemTwoSolution[0]);
            min = Math.min(subProblemOneSolution[1], subProblemTwoSolution[1]);
            return new int[]{max, min};
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array elements: ");
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int j = a.length - 1;
        int[] res = maxMinDac(a, 0, j);
        System.out.println(String.format("MIN: %s \nMAX: %s", res[1], res[0]));
    }
}

