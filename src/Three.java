public class Three {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }

        double average = (double) sum / arr.length;

        System.out.println("\nМассив: ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println("\nСумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f\n", average);
    }
}
