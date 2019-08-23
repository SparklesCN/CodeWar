/*
1. map 存名字和成绩对应关系；
2. arrayName 按先后存名字；
3. arraySore 按先后存成绩；
4. sort arrayScore
5. loop arrayName 从最高成绩查，查到的第一个 arrayName[]改”null“。直接break；查到的名字存入resArray;
6. 打印resArray的名字和对应的成绩
*/

/*
定义一个
class student {
    int index;
    String name;
    int score；
    
    // 定义比较器
    // 首先比成绩，选成绩高/低的那个；
    // 如果成绩相同，选index小的那个；
}
*/

import java.util.*;
import java.io.*;

public class Main {
    public static class Student {
        static int index;
        static String name;
        static int score;
        // constructor
        public Student(int i, String n, int s) {
            index = i;
            name = n;
            score = s;
        }
        public Student(){
            
        }
        // set Methods
        public static void setIndex(int i) {
            index = i;
        }
        public static void setName(String n) {
            name = n;
        }
        public static void setScore(int s) {
            score = s;
        }
        // get Methods
        public static int getIndex() {
            return index;
        }
        public static String getName() {
            return name;
        }
        public static int getScore() {
            return score;
        }
        // set print format
        @Override
        public String toString() {
            return index + " " + name + " " + score;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (scanner.hasNext()) {
            int studentNum = scanner.nextInt();
            int sortMode = scanner.nextInt();
            scanner.nextLine();
            Student[] studentList = new Student[studentNum];
            for (int i = 0; i < studentNum; i++) {
            	String input = scanner.nextLine();
            	String[] array = input.split(" ");
                String curName = array[0];
                int curScore = Integer.parseInt(array[1]);
                Student curStudent = new Student(i, curName, curScore);
                studentList[i] = curStudent;
                System.out.println(curStudent.getIndex() + " " + curStudent.getName() + " " + curStudent.getScore());
            }
            System.out.println(Arrays.toString(studentList));
        }
        scanner.close();
    }
    
    static Comparator<Student> c = new Comparator(){
		public int compare(Object a0, Object a1) {
			Student s1 = (Student) a0;
			Student s2 = (Student) a1;
			if (s1.getScore() == s2.getScore()) {
                return s1.getIndex() - s2.getIndex();
            }
            return s1.getScore() - s2.getScore();
		}
	};
}