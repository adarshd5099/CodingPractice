package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketSequences {
    public static void main(String[] args) throws IOException {
        int open = 0, close = 0, i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");
        for (i = 0; i < str.length; i++) {
            if (str[i].equals("(")) open++;
            else close++;
        }
        var result = open < close ? open : close;
        System.out.println(result);
    }
}
