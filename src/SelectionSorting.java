import java.util.Arrays;
import java.util.Random;

public class SelectionSorting {

    public static void main(String[] args){

        Random random = new Random();

        int array[] = new int[10];

        for (int i = 0; i < 10; i++){
            array[i] = random.nextInt(99);
        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sorted by SelectionSort : " + Arrays.toString(SelectionSort(array)));
    }

    private static int[] Swap(int[] array, int firstIndex, int secondIndex){

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        return array;
    }

    private static int[] SelectionSort(int[] array){

        int sortedRangeEnd = 0;
        while (sortedRangeEnd < array.length)
        {
            int nextIndex = SmallestIndex(array, sortedRangeEnd);
            Swap(array, sortedRangeEnd, nextIndex);
            sortedRangeEnd++;
        }

        return array;
    }

    private static int SmallestIndex(int[] array, int sortedRangeEnd){

        int currentSmallest = array[sortedRangeEnd];
        int currentSmallestIndex = sortedRangeEnd;

        for (int i = currentSmallestIndex + 1; i < array.length; i++){
            if (currentSmallest > array[i]){
                currentSmallest = array[i];
                currentSmallestIndex = i;
            }
        }

        return currentSmallestIndex;
    }


}
