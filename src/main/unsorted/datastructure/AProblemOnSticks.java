package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class AProblemOnSticks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            br.readLine();
            System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).filter(c -> c != 0).distinct().count());
        }
    }
}
