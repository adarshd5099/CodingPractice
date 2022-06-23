package main.AdvancedLevel1200To1400.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int count = 0;
            String j = br.readLine();
            String s = br.readLine();
            for (String a : s.split("")) {
                if (j.contains(a)) count++;
            }
            System.out.println(count);
        }
    }
}
