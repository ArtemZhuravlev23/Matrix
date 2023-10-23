import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter a row numbers: ");
        int rows = scanner.nextInt();

        System.out.print("Please, enter a column numbers: ");
        int columns = scanner.nextInt();


        int[][] originalMatrix = new int[rows][columns];

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                originalMatrix[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }

        int[][] transposedMatrix = new int[originalMatrix[0].length][originalMatrix.length];

        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        System.out.println("Original matrix: ");
        printMatrix(originalMatrix);


        System.out.println("Transpose matrix: ");
        printMatrix(transposedMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
