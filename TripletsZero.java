/**
 * Created by MalhotR1 on 05/17/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TripletsZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            boolean found = false;
            int sum = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length - 2; i++) {
              sum = arr[i];
                for (int j = i+1; j < arr.length - 1; j++) {
                    sum += arr[j];
                    for (int k = j+1; k < arr.length; k++) {
                        sum += arr[k];
                    }
                }
                if (sum == 0) {
                    System.out.println(1);
                    found = true;
                }


            }
            if (!found) System.out.println(0);
        }
    }
}
