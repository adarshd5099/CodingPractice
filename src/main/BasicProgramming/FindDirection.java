package main.BasicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <a href="https://www.codechef.com/problems/FACEDIR">FACEDIR</a>
 * Chef is currently facing the north direction. Each second he rotates exactly 90 degrees in clockwise direction. Find the direction in which Chef is facing after exactly X seconds.
 * Note: There are only 4 directions: North, East, South, West (in clockwise order).
 */
class FindDirection {
    public static void main(String[] args) throws IOException {
        int T, x;
        List<String> direction = Stream.of("North", "East", "South", "West").collect(Collectors.toList());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            x = Integer.parseInt(br.readLine());
            System.out.println(direction.get(x % 4));
        }
    }
}
