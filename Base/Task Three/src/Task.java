public class Task {

    public static void main(String[] args) {

        boolean simple;
        for (int cycle1 = 2; cycle1 < 100; cycle1++) {
            simple = true;
            for (int cycle2 = 2; cycle2 < cycle1 - 1; cycle2++) {
                if (cycle1 % cycle2 == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                System.out.print(cycle1 + " ");
            }
        }

    }

}