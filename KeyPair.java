/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class KeyPair {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in2 = br.readLine().trim().split(" ");
            int N = Integer.parseInt(in2[0]);
            int tot = Integer.parseInt(in2[1]);
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            Arrays.sort(arr);
            boolean found = false;
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                temp = tot - arr[i];
                int index = Arrays.binarySearch(arr, temp);
                if (index > 0) {
                    found = true;
                    break;
                }
            }
            if (found) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
