package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * {<a href="https://www.codechef.com/problems/SUPCHEF">The Preparation</a>}
 * <p>
 * Chef has an exam which will start exactly M minutes from now.
 * However, instead of preparing for his exam, Chef started watching Season-1 of Superchef. Season-1 has N episodes,
 * and the duration of each episode is K minutes. Will Chef be able to finish watching Season-1
 * strictly before the exam starts?
 **/
class ThePreparations {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String[] arr = br.readLine().split(" ");
            if (Integer.parseInt(arr[1]) * Integer.parseInt(arr[2]) < Integer.parseInt(arr[0]))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
