public class Task {

    public static void main(String[] args) {

        int[] array = new int[10];
        int max = array[0];
        float sum = 0;
        System.out.print("Массив: ");
        for (int cycle = 0; cycle < array.length; cycle++) {
            array[cycle] = ((int) (Math.random() * 11)); //массив (10 элементов) заполнен рандомными числами от 0 до 10
            System.out.print(array[cycle] + " ");
            sum += array[cycle];
            if (array[cycle] > max) {
                max = array[cycle];
            }
        }
        System.out.println("\nСреднее значение в массиве: " + sum / array.length + "\nМаксимальное значение в массиве: " + max);

    }

}