public class SecondLargest {
	public static int findSecondLargest(int[] numbers) {
		if (numbers.length < 2) {
			throw new IllegalArgumentException("Array must have at least two elements");
		}

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = number;
			} else if (number > secondLargest && number != firstLargest) {
				secondLargest = number;
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 5, 20, 8, 12 };
		System.out.println("Second largest number: " + findSecondLargest(numbers));
	}
}
