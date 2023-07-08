package July3year2023;

// WAP to perform linear search on unsorted array

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
//        int[] arr = new int[5];
//        Scanner  sc = new Scanner(System.in);
//        System.out.print("Enter 5 values:- ");
//        for (int i = 0; i < arr.length; i++)
//            arr[i] = sc.nextInt();

        int[] arr = {13,32,26,45,1,-12};

        arr = linearSort(arr);

        for (int i:arr)
            System.out.print(i+" ");

    }

    public static int[] linearSort (int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
