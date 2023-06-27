public class MinMaxExample {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 1, 6};

        // Assume the first number is both the smallest and largest
        int smallest = numbers[0];
        int largest = numbers[0];

        // Iterate through the array to find the smallest and largest numbers
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
