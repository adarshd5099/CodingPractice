package main.unsorted.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.codechef.com/problems/CHSFORMT">CHSFORMT</a>
 * Given the time control of a chess match as a+b, determine which format of chess out of the given 4
 * it belongs to.
 * 1)Bullet if a+b<3
 * 2)Blitz if 3≤a+b≤10
 * 3)Rapid if 11≤a+b≤60
 * 4)Classical if 60<a+b
 */
class ChessFormat {
    public static void main(String[] args) throws IOException {
        int T, a, b, result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] arr = br.readLine().split(" ");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);
            if (a + b < 3)
                result = 1;
            else {
                if (a + b <= 10)
                    result = 2;
                else {
                    if (a + b <= 60)
                        result = 3;
                    else
                        result = 4;
                }
            }
            System.out.println(result);
        }
    }
}