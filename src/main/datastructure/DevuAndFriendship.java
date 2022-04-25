package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <a href="https://www.codechef.com/problems/CFRTEST">https://www.codechef.com/problems/CFRTEST</a>
 */
class DevuAndFriendship {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            br.readLine();
            System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet()).size());
        }
    }
}