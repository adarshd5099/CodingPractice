package main.unsorted.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class MaximizeSum {
    public static void main(String[] args) throws IOException {
        int T, N, K, i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        while (T-- > 0) {
            HashMap<Integer, Integer> hashmap = new HashMap<>();
            StringTokenizer str = new StringTokenizer(br.readLine());
            N = Integer.parseInt(str.nextToken());
            K = Integer.parseInt(str.nextToken());
            str = new StringTokenizer(br.readLine());
            for (i = 0; i < N; i++) {
                int number = Integer.parseInt(str.nextToken());
                if (hashmap.get(number) != null) {
                    hashmap.put(number, hashmap.get(number) + 1);
                } else {
                    hashmap.put(number, 1);
                }
            }
            long[] sum = new long[hashmap.size()];
            i = 0;
            for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
                if (entry.getKey() > 0) {
                    sum[i++] = (long) entry.getKey() * entry.getValue();
                }
            }

            Long ans = Arrays.stream(sum).boxed().sorted(Collections.reverseOrder()).mapToLong(Long::longValue).limit(K).sum();
            result.append(ans).append("\n");
        }
        System.out.print(result);
    }
}
