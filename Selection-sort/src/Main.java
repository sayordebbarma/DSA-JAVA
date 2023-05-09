public class Main {
    public static void main(String[] args) {
        int[] array = {44, 33, 77, 11, 88, 22, 55, 99};

        selectionSort(array);

        for (int i : array)
            System.out.print(i + " ");
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[min] > array[j])
                    min = j;
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}