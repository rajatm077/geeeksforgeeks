/**
 * Created by MalhotR1 on 05/09/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class CommonNodesInBST {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int N2 = Integer.parseInt(br.readLine().trim());
            String[] in2 = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            Arrays.sort(arr);

            int[] arr2 = new int[in2.length];
            for (int i = 0; i < in2.length; i++) {
                arr2[i] = Integer.parseInt(in2[i]);
            }
            Arrays.sort(arr2);

            int[] larger = (arr.length >= arr2.length) ? arr : arr2;
            int[] smaller = (arr.length > arr2.length) ? arr2 : arr;

            int i = 0, j = 0;
            while (i < smaller.length) {
                while (j < larger.length) {
                    if (smaller[i] == larger[j]) {
                        System.out.print(smaller[i] + " ");
                        j++;
                        break;
                    }
                    j++;
                }
                i++;
            }
            System.out.println();
        }
    }
}
