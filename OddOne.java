/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class OddOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length;) {
                int count = 1;
                int j = i + 1;
                for (; j < arr.length && arr[i] == arr[j]; j++) {
                    count++;
                }
                if (count%2 == 1) {
                    System.out.println(arr[i]);
                    break;
                }
                 i = j;
            }
        }
    }
}
