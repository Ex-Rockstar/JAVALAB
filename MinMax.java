import java.util.Arrays;

public class MinMax{
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 1, 6};

        int smallest = Arrays.stream(numbers).min().getAsInt();
        int largest = Arrays.stream(numbers).max().getAsInt();

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
