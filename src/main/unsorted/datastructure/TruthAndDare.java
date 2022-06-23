package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class TruthAndDare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            br.readLine();
            Set<Integer> rTruth = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
            br.readLine();
            Set<Integer> rDare = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
            Integer.parseInt(br.readLine());
            Set<Integer> sTruth = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
            int truthCount = sTruth.size();
            Integer.parseInt(br.readLine());
            Set<Integer> sDare = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
            int dareCount = sDare.size();
            rTruth.retainAll(sTruth);
            rDare.retainAll(sDare);
            System.out.println(rTruth.size() == truthCount && rDare.size() == dareCount ? "yes" : "no");

        }
    }
}
