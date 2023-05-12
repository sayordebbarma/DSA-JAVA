import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {21, 12, 32, 25, 22};

        quickSort(array, 0, array.length - 1);

        System.out.println("The quick Sort of " + Arrays.toString(array) + " is ");
        for (int i : array)
            System.out.print(i + " ");
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) {
        if (endIndex <= startIndex) return; //base case

        int pivot = partition(array, startIndex, endIndex);
        quickSort(array, startIndex, pivot - 1);
        quickSort(array, pivot +1, endIndex);

    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[endIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j <= endIndex - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[endIndex];
        array[endIndex] = temp;

        return i;
    }
}