public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 30, -1, 22, -17};
        int min_value = numbers[0];

        for (int number : numbers) {
            if (number < min_value) {
                min_value = number;
            }
        }
        System.out.println(min_value);
    }
}
