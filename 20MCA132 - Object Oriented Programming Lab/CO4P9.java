import java.util.Arrays;

public class CO4P9 {
    public static <T extends Comparable<T>> void bubbleSort(T[] array){
        int length = array.length-1;
        T temp;
        for (int i=0; i < length; i++){
            for (int j=0; j < length-i; j++){
                if (array[j].compareTo(array[j+1]) > 0){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Integer[] x = {4,5,3,2,1};
        System.out.println("Unsorted Array: "+Arrays.toString(x));
        bubbleSort(x);
        System.out.println("Sorted Array: "+Arrays.toString(x));
    }
}
