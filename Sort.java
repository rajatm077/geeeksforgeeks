/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
                if (arr[i]%2 != 0) arr[i] = -arr[i];
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) arr[i] = -arr[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
