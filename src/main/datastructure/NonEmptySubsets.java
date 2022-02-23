package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class NonEmptySubsets {
    public static void main(String[] args) throws IOException {
        Integer T, N, min, temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        T = Integer.parseInt(str.nextToken());
        while (T-- > 0) {
            str = new StringTokenizer(br.readLine());
            N = Integer.parseInt(str.nextToken());
            str = new StringTokenizer(br.readLine());
            min = Integer.MAX_VALUE;
            while (N-- > 0) {
                temp = Integer.parseInt(str.nextToken());
                min = temp < min ? temp : min;
            }
            System.out.println(min);
        }
    }

}
