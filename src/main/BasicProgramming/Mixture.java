package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <a href="https://www.codechef.com/problems/MIXTURE">https://www.codechef.com/problems/MIXTURE</a>
 * Chef has A units of solid and B
 * <p>
 * units of liquid. He combines them to create a mixture. What kind of mixture does Chef produce: a solution, a solid, or a liquid?
 * <p>
 * A mixture is called :
 * <p>
 * 1) A solution if A>0
 * and B>0
 * <p>
 * ,
 * <p>
 * 2) A solid if B=0
 * <p>
 * , or
 * <p>
 * 3) A liquid if A=0
 * .
 */
class Mixture {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String result;
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (arr[0] > 0 && arr[1] > 0) result = "Solution";
            else if (arr[1] == 0) result = "Solid";
            else result = "Liquid";
            System.out.println(result);
        }
    }
}
