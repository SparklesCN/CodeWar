// import java.util.*;
// import java.io.*;

// public class Main {

//     public static void quickSort(int[] array) {
//         if (array == null || array.length < 2) {
//             return;
//         }
//         quickSort(array, 0, array.length - 1);
//     }

//     public static void quickSort(int[] array, int l, int r) {
//         if (l < r) {
//             // random pivot
//             int randomPivotIndex = (int)Math.random() * (r - l + 1);
//             swap(array, r, randomPivotIndex + l);
//             int[] bound = partition(array, l, r);
//             quickSort(array, l, bound[0] - 1);
//             quickSort(array, bound[1] + 1, r);
//         }
//     }

//     public static int[] partition(int[] array, int l, int r) {
//         int less = l - 1;
//         int more = r;
//         int pivotIndex = r;
//         while (l < more) {
//             // if cur left < pivot
//             if (array[l] < array[pivotIndex]) {
//                 less++;
//                 swap(array, less, l++);
//             }
//             else if (array[l] > array[pivotIndex]) {
//                 more--;
//                 swap(array, more, l);
//             }
//             else {
//                 l++;
//             }
//         }
//         swap(array, more, r);
//         return new int[] {less + 1, more};
//     }

//     public static void swap(int[] array, int a, int b) {
//         int temp = array[a];
//         array[a] = array[b];
//         array[b] = temp;
//         return;
//     }

//     public static void main(String[] args) {
//         int[] array = {5, 3, 0, 2 ,1 ,4, -1};
//         System.out.println(Arrays.toString(array));
//         quickSort(array);
//         System.out.println(Arrays.toString(array));
//     }
// }

import java.util.*;
import java.io.*;

public class Main {

    public static void quickSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        quickSort(array, 0, array.length-1);
    }

    public static void quickSort(int[] array, int l, int r) {
        if (l < r) {
            int randomPivotIndex = (int)Math.random() * (r-l+1);
            swap(array, r, randomPivotIndex);
            int[] bounds = partition(array, l, r);
            quickSort(array, l, bounds[0] - 1);
            quickSort(array, bounds[1] + 1, r);
        }
    }

    public static int[] partition(int[] array, int l, int r) {
        int pivotIndex = r;
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (array[l] < array[pivotIndex]) {
                less++;
                swap(array, less, l++);
            }
            else if (array[l] > array[pivotIndex]) {
                more--;
                swap(array, more, l);
            }
            else {
                l++;
            }
        }
        swap(array, more, r);
        return new int[] {less + 1, more};
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 0, 2 ,1 ,4, -1};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}