/**
 * Created by MalhotR1 on 04/27/2017.
 */

import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReverseSubArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            String[] in2 = br.readLine().trim().split(" ");
            int L = Integer.parseInt(in2[0]) - 1;
            int R = Integer.parseInt(in2[1]) - 1;
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            while (L < R) {
                int temp = arr[L];
                arr[L] = arr[R];
                arr[R] = temp;
                L++; R--;
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
