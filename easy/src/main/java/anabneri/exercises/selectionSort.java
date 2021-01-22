package anabneri.exercises;

public class selectionSort {
    public static int[] selectionSort(int[] array) {

        // found the minor index if the element
        if (array.length == 0) {
            return new int[] {};
        }

        int startIndex = 0;
        while (startIndex < array.length - 1) {
            int smallestIndex = startIndex;
            for (int i  = startIndex + 1; i < array.length; i++) {
                if (array[smallestIndex] > array[i]) {
                    smallestIndex = i;
                }
            }
            // helper function
            swap(startIndex, smallestIndex, array);
            startIndex++;
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
