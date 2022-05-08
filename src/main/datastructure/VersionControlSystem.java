package main.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://www.codechef.com/submit/VCS
 */
class VersionControlSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Set<Integer> ignored = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
            Set<Integer> tracked = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
            Set<Integer> result = new HashSet<>(ignored);
            result.retainAll(tracked);
            ignored.addAll(tracked);
            StringBuilder resultString = new StringBuilder();
            resultString.append(result.size()).append(" ").append(arr[0] - ignored.size());
            System.out.println(resultString);
        }
    }
}