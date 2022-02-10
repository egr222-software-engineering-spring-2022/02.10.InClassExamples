import java.util.Arrays;

public class reverseWithProblem {
    public static void main(String[] args) {
        int[] numbers = {11, 42, -5, 27, 0, 89};

        System.out.println("Before: " + Arrays.toString(numbers));
        // reverse the array
        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println("After: " + Arrays.toString(numbers));
    }
}