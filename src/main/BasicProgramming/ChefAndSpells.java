package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ChefAndSpells {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().skip(1).sum());
        }
    }
}
