/**
 * Created by MalhotR1 on 05/09/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Preorder {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().split(" ");
            arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            printPreorder(0, arr.length - 1);
        }
    }

    private static void printPreorder(int start, int end) {
        if (start <= end) {
            int index = (int) Math.floor((start+ end) / 2);
            System.out.print(arr[index] + " ");
            printPreorder(start, index - 1);
            printPreorder(index + 1, end);
        }
    }
}
