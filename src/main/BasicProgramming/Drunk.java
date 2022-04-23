package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Drunk {
    public static void main(String[] args) throws IOException {
        int T, k;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            k = Integer.parseInt(br.readLine());
            if (k % 2 == 0) System.out.println(k);
            else System.out.println(k + 2);
        }
    }
}
