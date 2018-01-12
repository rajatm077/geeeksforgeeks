/**
 * Created by MalhotR1 on 04/26/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Atoi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine().trim();
        int num = atoi(in);
        System.out.println(num);
    }
    private static int atoi(String str)
    {
        int number = 0;
        boolean negative = false;
        char[] in = str.toCharArray();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == '-') {
                negative = true;
                continue;
            }
            if (in[i] < 48|| in[i] > 57) return -1;
            else {
                number = number * 10 + (int) (in[i] - 48);
            }
        }
        if (negative) number = -number;
        return number;
    }
}
