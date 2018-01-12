/**
 * Created by MalhotR1 on 04/19/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class OccurrenceX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            int key = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            boolean found = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    System.out.print(i + " ");
                    int j = i+1;
                    while (j < arr.length && arr[j] == key) j++;
                    System.out.println(j-1);
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println(-1);
        }
    }


}
