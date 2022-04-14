package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TwoRooks {
    public static void main(String[] args) throws IOException {
        int T, t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (t = 0; t < T; t++) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals(arr[2]) || arr[1].equals(arr[3])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
