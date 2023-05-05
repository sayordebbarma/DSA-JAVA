public class Main {
    public static void main(String[] args) {

//        linear search - Iterate through a collection one element at a time
        int[] array = {77, 22, 44, 66, 11, 55, 33};

        int index = linearSearch(array, 43);

        if(index != -1)
            System.out.println("Element is found at index: " + index);
        else
            System.out.println("Element not found in the array");
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}