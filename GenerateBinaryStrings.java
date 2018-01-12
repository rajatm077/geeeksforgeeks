/**
 * Created by MalhotR1 on 04/25/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class GenerateBinaryStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            ArrayList<char[]> strings = new ArrayList<>();
            char[] in = br.readLine().trim().toCharArray();
            print(in, 0);
        }
    }

    private static void print(char[] str, int index)
    {
        if (index == str.length)
        {
            printString(str);
            return;
        }

        if (str[index] == '?')
        {
            // replace '?' by '0' and recurse
            str[index] = '0';
            print(str, index + 1);

            // replace '?' by '1' and recurse
            str[index] = '1';
            print(str, index + 1);

            // No need to backtrack as string is passed
            // by value to the function
        }
        else
            print(str, index + 1);
    }
   

    private static void printString(char[] in) {
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i]);
        }
        System.out.print(" ");
    }
}
