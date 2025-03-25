public class ArraySearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println(target + " is not present in the array.");
        } else {
            System.out.println(target + " is present in the array.");
        }
    }
}
