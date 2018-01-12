/**
 * Created by MalhotR1 on 04/27/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PermutationOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            char[] in = br.readLine().trim().toCharArray();
            for (int i = 0; i < in.length; i++) {
                printAllPerms(in, i);
            }

        }
    }

    private static void printAllPerms(char[] in, int index) {

    }
}
