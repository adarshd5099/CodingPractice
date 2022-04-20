package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class VacationTransportation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String result;
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] + arr[1] < arr[2]) result = "PLANEBUS";
            else if (arr[0] + arr[1] == arr[2]) result = "EQUAL";
            else result = "TRAIN";
            System.out.println(result);
        }
    }
}
