public class SumOfDigits {
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 12345; // Change this to test with other numbers
        System.out.println("Sum of digits: " + sumDigits(number));
    }
}
