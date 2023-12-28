import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,6,4,3,7,2};
        InsertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void InsertionSorting(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp;
                } else {
                    break;
                }
            }

        }
    }
}
