import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
// --> best case time complexity = bigoh(N);where N are compareison made.
// --> worst case bigoh(N2).
// --> inplace sorting algorithm ==> no extra array required for sorting.
// --> stable algorithm if our input array is not sorted==> stable means the order
// --> of element in array remains unchange.
// --> also called sinking sort and exchange sort.
    static void BubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }

        }
    }
}
