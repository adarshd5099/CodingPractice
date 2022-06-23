package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.codechef.com/problems/WATSCORE
 */
class ThatIsMyScore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] count = new int[12];
            while (n-- > 0) {
                int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                count[arr[0]] = arr[1] > count[arr[0]] ? arr[1] : count[arr[0]];
            }
            System.out.println(Arrays.stream(count).limit(9).sum());
        }
    }
}
