/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class TwoUnique {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            long[] arr = new long[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Long.parseLong(in[i]);
            }
            Arrays.sort(arr);
            for (int i = 1; i < arr.length;) {
                if ((arr[i-1] ^ arr[i]) == 0) i += 2;
                else {
                    if ((arr[i+1] ^ arr[i]) == 0)
                        System.out.print(arr[i-1] + " ");
                    else
                        System.out.print(arr[i] + " ");
                    i++;
                }
            }
        }
    }
}
