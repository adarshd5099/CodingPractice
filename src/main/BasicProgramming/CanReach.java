package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <a href="https://www.codechef.com/problems/CAN_REACH">CAN_REACH</a>
 * A first-year student, came to your college. Being a good senior, you must tell him if it is possible to go from College Main Gate to Hostel for him.
 * <p>
 * The college can be visualized on a 2D-plane. Suppose the College Main Gate is situated at origin i.e. at the coordinates (0,0)
 * and the Hostel is situated at the coordinates (x,y)
 * <p>
 * As the first-year student wants to explore the college campus further, in one move, he will increase or decrease any coordinate (either the x-coordinate or the y-coordinate) by a value of exactly K
 * Is it possible for the first-year student to reach the Hostel?
 */
public class CanReach {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] arr = br.readLine().split(" ");
            if (Integer.parseInt(arr[0]) % Integer.parseInt(arr[2]) == 0 && Integer.parseInt(arr[1]) % Integer.parseInt(arr[2]) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
