package July3year2023;

public class LLS2 {
        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; // Found the target at index i
                } else if (array[i] > target) {
                    return -1; // Target is not present in the array
                }
            }
            return -1; // Target is not present in the array
        }

        public static void main(String[] args) {
            int[] array = {1, 3, 5, 7, 9, 11, 13};
            int target = 7;
            int index = linearSearch(array, target);
            if (index != -1) {
                System.out.println("Target found at index " + index);
            } else {
                System.out.println("Target not found in the array.");
            }
        }

}
