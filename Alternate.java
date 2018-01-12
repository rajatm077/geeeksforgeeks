/**
 * Created by MalhotR1 on 04/27/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Alternate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        int N = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int[] arr = new int[in.length];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }
            ArrayList<Integer> pos = new ArrayList<>();
            ArrayList<Integer> neg = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 0) pos.add(arr[i]);
                else neg.add(arr[i]);
            }

            int i = 0;
            int j = 0;
            while (i < pos.size() && j < neg.size()) {
                System.out.print(pos.get(i) + " ");
                System.out.print(neg.get(j) + " ");
                i++;
                j++;
            }
            while (i < pos.size()) {
                System.out.print(pos.get(i) + " ");
                i++;
            }
            while (j < neg.size()) {
                System.out.print(pos.get(i) + " ");
                j++;
            }
            System.out.println();
        }
    }
}
