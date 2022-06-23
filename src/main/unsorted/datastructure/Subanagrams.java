package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Subanagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] temp = new int[n][26];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int l = s.length();
            for (int j = 0; j < l; j++) {
                temp[i][s.charAt(j) - 97]++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, temp[j][i]);
            }
            while (min-- > 0) {
                ans.append((char) (i + 'a'));
            }
        }
        System.out.println(ans.length() > 0 ? ans.toString() : "no such string");
    }
}
