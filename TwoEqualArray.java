/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class TwoEqualArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            String[] in2 = br.readLine().trim().split(" ");

            int[] arr1 = new int[in.length];
            int[] arr2 = new int[in2.length];
            for (int i = 0; i < in.length; i++) {
                arr1[i] = Integer.parseInt(in[i]);
                arr2[i] = Integer.parseInt(in2[i]);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean flag = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println(0);
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(1);
        }
    }
}
