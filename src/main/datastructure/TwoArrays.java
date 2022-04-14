package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoArrays {
    public static void main(String[] args) throws IOException {
        int N, sumA = 0, sumB = 0, a = 0, b = 0, i, A, B;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().trim().split(" ");
        String[] strB = br.readLine().trim().split(" ");
        for (i = 0; i < N; i++) {
            A = Integer.parseInt(strA[i]);
            B = Integer.parseInt(strB[i]);
            if (A >= 0) sumA += A;
            else if (A == -1) a++;
            if (B >= 0) sumB += B;
            else if (B == -1) b++;
        }
        if (a == 1 && b == 0) {
            if (sumA <= sumB) System.out.println(1);
            else System.out.println(0);
        } else if (b == 1 && a == 0) {
            if (sumB <= sumA) System.out.println(1);
            else System.out.println(0);
        } else if (a == 2 && b == 0) {
            if (sumA <= sumB) System.out.println((sumB - sumA) + 1);
            else System.out.println(0);
        } else if (b == 2 && a == 0) {
            if (sumB <= sumA) System.out.println((sumA - sumB) + 1);
            else System.out.println(0);
        } else {
            System.out.println("Infinite");
        }

    }
}
