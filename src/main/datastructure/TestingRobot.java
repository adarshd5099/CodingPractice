package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class TestingRobot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine().split(" ")[1]);
            Set<Integer> ans = new HashSet<>();
            ans.add(x);
            for (String a : br.readLine().split("")) {
                x = x + (a.equals("L") ? -1 : 1);
                ans.add(x);
            }
            System.out.println(ans.size());
        }
    }
}
