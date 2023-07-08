public class LLS1 {
        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; 
                }
            }
            return -1; 
        }
        public static void main(String[] args) {
            int[] array = { 5, 3, 8, 4, 2 };
            int target = 8;

            int index = linearSearch(array, target);

            if (index != -1) {
                System.out.println("Target " + index);
            } else {
                System.out.println("Target not found ");
            }
        }

}
