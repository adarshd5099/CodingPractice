package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://www.codechef.com/problems/GENE01">https://www.codechef.com/problems/GENE01</a>
 * People in Chefland have three different eye colors, namely brown, blue, and green. green is the rarest of the eye colors whereas brown is most common.
 * <p>
 * The eye color of the child of two people is most likely to be the most common eye color between them.
 * <p>
 * You are given two characters denoting the eye colors of two people in Chefland. The character R denotes bRown color, B denotes Blue color, and G denotes Green color.
 * <p>
 * Determine the most likely eye color of their child. (Print R, B or G denoting bRown, Blue or Green respectively).
 */
class Genes {
    public static void main(String[] args) throws IOException {
        List<String> list = Arrays.asList("G", "B", "R");
        String[] arr = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        System.out.println(list.get(Math.max(list.indexOf(arr[0]), list.indexOf(arr[1]))));
    }
}
