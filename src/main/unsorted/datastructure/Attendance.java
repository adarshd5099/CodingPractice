package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Attendance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()), i = -1;
            HashMap<String, Integer> count = new HashMap<>();
            List<String> names = new ArrayList<>();
            String[] fName = new String[100];
            String[] lName = new String[100];
            while (i++ < n - 1) {
                String[] name = br.readLine().split(" ");
                count.merge(name[0], 1, Integer::sum);
                fName[i] = name[0];
                lName[i] = name[1];
            }
            for (i = 0; i < n; i++) {
                System.out.println(count.get(fName[i]) > 1 ? fName[i] + " " + lName[i] : fName[i]);
            }
        }
    }
}
