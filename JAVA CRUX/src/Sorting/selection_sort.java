package Sorting;

public class selection_sort {
    public static void printArray(int[] arr){

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
    public static void main(String args[]) {
//             BUBBLE SORT

        int arr[] = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

    }
}