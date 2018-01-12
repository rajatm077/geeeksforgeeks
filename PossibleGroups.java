/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PossibleGroups {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if (arr[i] % 3 == 0){
                    if (set.contains(arr[i])){ arr[i] = -1; }
                    else set.add(arr[i]);
                }
            }
            int total = calculateTotal(set.size());
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0 || set.contains(arr[i])) continue;
                else {
                    for (int j = i + 1; j < arr.length; j++) {
                        if ((arr[i] + arr[j]) % 3 == 0) {
                            total += 1 + set.size();
                        }
                    }
                }
            }
            System.out.println(total);

        }
    }

    private static int calculateTotal(int N) {
        return ((N+1) * N * (N-1))/6;
    }
}

