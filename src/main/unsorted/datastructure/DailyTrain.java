package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class DailyTrain {

    public static int factorial(int n) {
        if (n <= 2) return n;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = arr[0], n = arr[1];
        int totalCount = 0;
        while (n-- > 0) {
            int[] car = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
            int front = 0, back = 53;
            for (int j = 0; j < 9; j++) {
                int count = 0;
                for (int i = 0; i < 4; i++) if (car[front++] == 0) count++;
                for (int i = 0; i < 2; i++) if (car[back--] == 0) count++;
                if (count > x) totalCount += factorial(count) / (factorial(count - x) * factorial(x));
                if (count == x) totalCount++;
            }
        }
        System.out.println(totalCount);
    }
}
