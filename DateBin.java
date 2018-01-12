/**
 * Created by MalhotR1 on 04/29/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;

public class DateBin {
    public static void main(String[] args) throws IOException {
        int[] arr = {7,2,2017};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Integer.toHexString(arr[i]));
        }
    }
}
