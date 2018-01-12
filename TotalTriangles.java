/**
 * Created by MalhotR1 on 04/28/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TotalTriangles {
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

            int count = 0;
            for (int i = 0; i < N-2; i++) {
                for (int j = i+1; j < N-1; j++) {
                    for (int k = j+1; k < N; k++) {
                        if (arr[i]+arr[j]> arr[k]) count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
