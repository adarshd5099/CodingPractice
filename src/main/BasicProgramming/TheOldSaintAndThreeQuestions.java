package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class TheOldSaintAndThreeQuestions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum() == Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sum() ? "Pass" : "Fail");
        }
    }
}
