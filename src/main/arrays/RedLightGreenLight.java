package main.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class RedLightGreenLight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int k = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()[1];
            System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(c -> c > k).boxed().count());
        }
    }
}
