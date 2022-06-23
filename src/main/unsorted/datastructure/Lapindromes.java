package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://www.codechef.com/submit/LAPIN
 */
class Lapindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String a, b, s;
            s = br.readLine();
            a = s.substring(0, s.length() / 2);
            b = s.length() % 2 == 0 ? s.substring(s.length() / 2) : s.substring(s.length() / 2 + 1);
            System.out.println(Arrays.stream(a.split("")).sorted().map(Object::toString).collect(Collectors.joining()).equals(Arrays.stream(b.split("")).sorted().map(Object::toString).collect(Collectors.joining())) ? "YES" : "NO");
        }
    }


}
