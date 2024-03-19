package Matrix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int lines = 3, columns = 3;

        Matrix matrix1 = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                matrix1.setValue(line, column, scan.nextFloat());
            }
        }
        matrix1.getMatrix();

        Matrix matrix2 = new Matrix(lines, columns);
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                matrix2.setValue(line, column, scan.nextFloat());
            }
        }
        matrix2.getMatrix();

        matrix1.matrixScalar(3).getMatrix();
        matrix1.matrixMultiply(matrix2).getMatrix();
        matrix1.matrixAdd(matrix2).getMatrix();
    }

}
