package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WaterSports {
    public static void main(String[] args) throws IOException {
        int T, t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] arr = br.readLine().split(" ");
            Integer bal = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
            if (bal >= Integer.parseInt(arr[2]) + Integer.parseInt(arr[3]) + Integer.parseInt(arr[4])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
