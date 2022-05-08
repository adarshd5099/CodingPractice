package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ChefAndDigitsOfANumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            System.out.println(Arrays.stream(s.split("")).filter(c -> c.equals("0")).count() == 1 || Arrays.stream(s.split("")).filter(c -> c.equals("1")).count() == 1 ? "Yes" : "No");
        }
    }
}
