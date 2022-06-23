package main.unsorted.datastructure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LittleElephant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> kString = new ArrayList<>();
        int i = 0;
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while (i++ < arr[0]) kString.add(br.readLine());
        i = 0;
        while (i++ < arr[1]) {
            String nString = br.readLine();
            if (nString.length() >= 47)
                System.out.println("Good");
            else
                System.out.println(kString.stream().anyMatch(ks -> nString.contains(ks)) ? "Good" : "Bad");
        }
    }
}
