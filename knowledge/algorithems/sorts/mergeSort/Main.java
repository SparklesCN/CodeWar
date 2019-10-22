// import java.util.*;
// import java.io.*;

// public class Main {

//     public static void mergeSort(int[] array) {
//         if (array == null || array.length < 2) {
//             return;
//         }
//         else {
//             mergeSort(array, 0, array.length - 1);
//         }
//     }

//     public static void mergeSort(int[] array, int l, int r) {
//         if (l == r) {
//             return;
//         }
//         int mid = l + ((r - l) >> 1);
//         mergeSort(array, l, mid);
//         mergeSort(array, mid+1, r);
//         merge(array, l, mid, r);
//     }

//     public static void merge(int[] array, int l, int mid, int r) {
//         int[] help = new int[r-l+1];
//         int i = 0;
//         int pointer1 = l;
//         int pointer2 = mid + 1;
//         while (pointer1 <= mid && pointer2 <= r) {
//             help[i++] = array[pointer1] < array[pointer2] ? array[pointer1++] : array[pointer2++];
//         }
//         // left
//         while (pointer1 <= mid) {
//             help[i++] = array[pointer1++];
//         }
//         while (pointer2 <= r) {
//             help[i++] = array[pointer2++];
//         }
//         for (i = 0; i < help.length; i++) {
//             array[l+i] = help[i];
//         }
//     }

//     public static void main(String[] args) {
//         int[] array = {5, 3, 0, 2 ,1 ,4, -1};
//         System.out.println(Arrays.toString(array));
//         mergeSort(array);
//         System.out.println(Arrays.toString(array));
//     }
// }

import java.util.*;
import java.io.*;

public class Main {

    public static void mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        mergeSort(array, 0, array.length-1);
    }

    public static void mergeSort(int[] array, int l, int r) {
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        mergeSort(array, l, mid);
        mergeSort(array, mid+1, r);
        merge(array, l, mid, r);
    }

    public static void merge(int[] array, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= r) {
            temp[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }
        while (p1 <= mid) {
            temp[i++] = array[p1++];
        }
        while (p2 <= r) {
            temp[i++] = array[p2++];
        }

        for (int index = 0; index < temp.length; index++) {
            array[l+index] = temp[index];
        }
        return;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 0, 2 ,1 ,4, -1};
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}