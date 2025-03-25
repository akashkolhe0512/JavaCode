public class ArmstrongChecker {
    public static void main(String[] args) {
        int number = 153;
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

