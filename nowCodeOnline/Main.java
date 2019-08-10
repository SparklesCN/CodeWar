// import java.util.*;
// public class Main{
//     public static int lengthOfLast(String str) {
//         String[] s =str.split(" ");
//         for (String i:s) {
//             System.out.println("-" + i + "-");
//         }
//         return s[s.length-1].length();
//     }
     
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         while(scan.hasNextLine()){
//             String str = scan.nextLine();
//             System.out.println(lengthOfLast(str));
//         }
//     }
// }

import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] inputArray = scanner.nextLine().split(" ");
            System.out.println(inputArray[inputArray.length-1].length());
        }
    }
}