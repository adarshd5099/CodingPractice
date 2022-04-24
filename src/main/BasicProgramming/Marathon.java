package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Marathon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int s = arr[0] * arr[1];
            if (s >= 42)
                System.out.println(arr[4]);
            else if (s >= 21)
                System.out.println(arr[3]);
            else if (s >= 10)
                System.out.println(arr[2]);
            else
                System.out.println(0);
        }
    }
}
