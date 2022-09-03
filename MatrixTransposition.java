import java.util.Scanner;

public class MatrixTransposition {

    public static void main(String[] args) {
//Транспонируйте матрицу M x N. Размеры M и N задаются из консоли.
// После ввода должны автоматически создаваться два массива размером M x N первый и N x M второй.
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите 1-е число определяющее количество строк");
        int matrixRows = scanner1.nextInt();
        System.out.println(" M = " + matrixRows);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите 2-е число определяющее оличество колонок");
        int matrixColumn = scanner2.nextInt();
        System.out.println("N = " + matrixColumn);


        int[][] arr = getArraysLenght(matrixRows, matrixColumn);

        printMatrix(arr);
        System.out.println("----------------------------");

        int[][] trans = new int[matrixColumn][matrixRows];
        for (int i = 0; i < matrixRows; i++) {
            for (int j = 0; j < matrixColumn; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        printMatrix(trans);
    }

    private static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getArraysLenght(int matrixRows, int matrixColumn){
        int[][] getMatrix = new int[matrixRows][matrixColumn];
        for (int i = 0; i < matrixRows; i++){
            for (int j = 0; j < matrixColumn; j++){
                getMatrix[i][j] = (int)(Math.random()*10);
            }
        }
        return getMatrix;
    }
    }


