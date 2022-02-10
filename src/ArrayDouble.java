import java.util.Arrays;

public class ArrayDouble {
    public static void main(String[] args) {
        int [] num = {1, 4, 0, 7};
        int [] ret = doubleArray(num);

        System.out.println("Sent: " + Arrays.toString(num));
        System.out.println("Return: " + Arrays.toString(ret));
    }

    public static int[] doubleArray(int[] numbers) {
        int[] result = new int[2 * numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[2 * i]     = numbers[i];
            result[2 * i + 1] = numbers[i];
        }
        return result;
    }
}
