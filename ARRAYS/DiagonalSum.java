public class DiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        int sum = getSUM(matrix);
        System.out.println("Sum : " + sum);

    }

    private static int getSUM(int[][] matrix) {

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - i - 1)
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }
}
