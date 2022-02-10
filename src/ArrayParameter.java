public class ArrayParameter {
    public static void main(String[] args) {
        int [] num = {2,4,5,6,9,33};
        double avg = average(num);
        System.out.println("Average is " + avg);
    }

    public static double average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}
