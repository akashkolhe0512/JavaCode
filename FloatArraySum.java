public class FloatArraySum {
    public static void main(String[] args) {
       
        float numbers[] = new float[] {9.2f, 3.1f, 7.5f, 6.4f, 8.6f};
        
        float sum = 0.0f;

                for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

                System.out.println("The sum of the array elements is: " + sum);
    }
}
