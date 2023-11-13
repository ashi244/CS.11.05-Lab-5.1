public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            System.out.println(", ");
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = (double) sum / array.length;
        return Math.floor(average * 100) / 100;
    }

    public static int minimum(int[] array) {
        int minimum = 100000;
        for (int i = 0; i < array.length; i++){
            minimum = Math.min(array[i], minimum);
        }
        return minimum;
    }

    public static int maximum(int[] array) {
        int maximum = 0;
        for (int i = 0; i < array.length; i++){
            maximum = Math.max(array[i], maximum);
        }
        return maximum;
    }

    public static int evenCount(int[] array) {
        int evenCount = 0;
        for (int n: array){
            if (n % 2 == 0){
                evenCount += 1;
            }
        }
        return evenCount;
    }

    public static int[] reverseOne(int[] array) {
        int [] newArray = new int [array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--){
            newArray[index] = array[i];
            index++;
        }
        return newArray;
    }

    public static void reverseTwo(int[] array) {
        int first = 0;
        int last = array.length - 1;
        while (first < last){
            int holder = array[last];
            array[last] = array[first];
            array[first] = holder;
            first++;
            last --;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(str)){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++){
            result = result + array[i];
            if (i != array.length - 1){
                result = result + ", ";
            }
        }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int lastElement = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        int firstElement = array[0];
        for (int i = 1; i < array.length; i++){
            array[i - 1] = array[i];
        }
        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++){
            shiftLeft(array);
        }
    }


}
