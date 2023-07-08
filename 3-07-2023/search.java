// WAP to perform linear search on sorted array
public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

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
