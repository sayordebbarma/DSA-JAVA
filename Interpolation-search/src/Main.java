public class Main {
    public static void main(String[] args) {
        int[] array = {40, 100, 1, 5, 25, 10};

        int index = interpolationSearch(array, 10);

        if (index != -1) {
            System.out.println("Element is found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int highValue = array.length - 1;
        int lowValue = 0;
        
        while (value >= array[lowValue] && value <= array[highValue] && lowValue <= highValue) {
            int probe = lowValue + (highValue - lowValue) * (value - array[lowValue]) /
                        (array[highValue] - array[lowValue]);

            System.out.println("Probe: " + probe);

            if (array[probe] == value) {
                return probe;
            }
            else if (array[probe] < value) {
                lowValue = probe + 1;
            }
            else {
                highValue = probe - 1;
            }
        }
        return -1;
    }
}