import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 35;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
//      use the commented part for using inbuilt binarySearch from Arrays
//      int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if(index == -1)
            System.out.println(target + " not available");
        else
            System.out.println("Element is available at index " + index);
    }

    private static int binarySearch(int[] array, int target) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            int value = array[middleIndex];

            System.out.println("Middle index: " + middleIndex); //optional - to check the steps

            if (value < target)
                lowIndex = middleIndex + 1;
            else if (value > target)
                highIndex = middleIndex - 1;
            else
                return middleIndex; //target found
        }
        return -1; //target not found
    }
}