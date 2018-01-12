/**
 * Created by MalhotR1 on 05/03/2017.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Qheap1 {
    static int heapSize = 6;
    static long[] arr = {1000000000,100000000,10000000,1000000,100000,10000};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            String[] in = br.readLine().trim().split(" ");
            int query = Integer.parseInt(in[0]);
            switch (query) {
                case 1:
                    long v = Long.parseLong(in[1]);
                    heapify(v);
                    break;
                case 2:
                    v = Long.parseLong(in[1]);
                    deleteElement(v);
                    break;
                case 3:
                    printMin();
                    break;

            }
        }
    }

    private static void printMin() {
        long min = Long.MAX_VALUE;
        for (int i = heapSize / 2; i < heapSize; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println(min);
    }

    private static void deleteElement(long v) {
        for (int i = 0; i < heapSize; i++) {
            if (arr[i] == v) {
                swap(i, heapSize - 1);
                heapSize--;
                maintainHeap(i);
                break;
            }
        }
    }

    private static void maintainHeap(int i) {
        while (true) {
            int largest = i;
            int left = 2*i + 1;
            if (left < heapSize && arr[left] > arr[i]) largest = left;
            int right = left + 1;
            if (right < heapSize && arr[right] > arr[largest]) largest = right;
            if (i == largest) break;
            else swap(largest, i);
            i = largest;
        }
    }

    private static void swap(int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void heapify(long v) {
        arr[heapSize] = v;
        int i = heapSize;
        heapSize++;
        while (i >= 0) {
            int parent = (i-1) / 2;
            if (arr[parent] < arr[i]) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }
}
