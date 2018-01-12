/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            for (int i = 1; i <= N ; i++) {
                printBinary(i);
            }
            System.out.println();
        }
    }
    private static void printBinary(int N) {
        ArrayList<Integer> al = new ArrayList<>();
        while (N > 0) {
            al.add(N % 2);
            N = N / 2;
        }
        for (int i = al.size() - 1; i >= 0 ; i--) {
            System.out.print(al.get(i));
        }
        System.out.print(" ");
    }
}
