import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeA = 0, typeB = 0, typeC = 0, typeD = 0, typeE = 0, invalidIPMask = 0, privateIP = 0;
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (!isValidIP(input) || !isValidMask(input)) {
                invalidIPMask++;
                continue;
            }
            if (isTypeA(input)) {
                typeA++;
            }
            else if (isTypeB(input)) {
                typeB++;
            }
            else if (isTypeC(input)) {
                typeC++;
            }
            else if (isTypeD(input)) {
                typeD++;
            }
            else if (isTypeE(input)) {
                typeE++;
            }
            if (isPrivate(input)) {
                privateIP++;
            }
        }
        System.out.printf("%d %d %d %d %d %d %d%n", typeA, typeB, typeC, typeD, typeE, invalidIPMask, privateIP);
    }

    public static boolean isValidIP (String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        // convert array to int array
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        if (intArray[0] < 1 || intArray[0] > 255) {
            return false;
        }
        if (intArray[1] < 0 || intArray[1] > 255) {
            return false;
        }
        if (intArray[2] < 0 || intArray[2] > 255) {
            return false;
        }
        if (intArray[3] < 0 || intArray[3] > 255) {
            return false;
        }
        return true;
    }

    public static boolean isValidMask (String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 4; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (!Character.isDigit(array[i].charAt(j))) {
                    return false;
                }
            }
            sBuffer.append(array[i]);
        }
        // convert to string
        String maskString = sBuffer.toString();
        // convert to Binary string
        String binaryStr = Integer.toBinaryString(Integer.parseInt(maskString));
        // test binaryStr format
        int fisrtIndexOf0 = binaryStr.indexOf('1');
        int lastIndexOf1 = binaryStr.lastIndexOf('1');
        if (fisrtIndexOf0 < lastIndexOf1) {
            return false;
        }
        return true;
    }

    public static boolean isTypeA(String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        // convert array to int array
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        // test
        if (intArray[0] >= 1 && intArray[0] <= 126) {
            return true;
        }
        return false;

    }

    public static boolean isTypeB(String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        // convert array to int array
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        // test
        if (intArray[0] >= 128 && intArray[0] <= 191) {
            return true;
        }
        return false;
    }

    public static boolean isTypeC(String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        // convert array to int array
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        // test
        if (intArray[0] >= 192 && intArray[0] <= 223) {
            return true;
        }
        return false;
    }

    public static boolean isTypeD(String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        // convert array to int array
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        // test
        if (intArray[0] >= 224 && intArray[0] <= 239) {
            return true;
        }
        return false;
    }

    public static boolean isTypeE(String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        // convert array to int array
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        // test
        if (intArray[0] >= 240 && intArray[0] <= 255) {
            return true;
        }
        return false;
    }
    public static boolean isPrivate(String input) {
        String[] array = input.split("[.~]");
        // if format not match
        if (array.length != 8) {
            return false;
        }
        // convert array to int array
        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Integer.parseInt(array[i]);
        }
        // test
        if (intArray[0] == 10 || (intArray[0] == 172 && intArray[1] >= 16 && intArray[1] <= 31) || (intArray[0] == 192 && intArray[1] == 168)) {
            return true;
        }
        return false;
    }
}