package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class VaccineDates {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[1] <= arr[0]) {
                if (arr[2] < arr[0]) System.out.println("Too Late");
                else System.out.println("Take second dose now");
            } else System.out.println("Too Early");
        }
    }
}
