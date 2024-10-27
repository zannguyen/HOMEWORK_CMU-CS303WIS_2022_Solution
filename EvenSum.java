public class EvenSum {
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("Sum of even numbers: " + sumEvenNumbers(numbers));
    }
}
