import java.util.ArrayList;
import java.util.List;

public class Collect {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 3 }, { 4, 5 }, { 10, 6 } };
        int[][] newArray = { { 7, 25 }, { 8, 20 } };

        int row = matrix[0].length;
        int col = matrix.length;

        List<int[]> array = new ArrayList<>();

        for (int[] is : matrix) {

            for (int i = 0; i < is.length - 1; i++) {
                if (is[0] < newArray[i][0]) {
                    array.add(is);
                } else if (is[0] > newArray[i][0]) {
                    array.add(newArray[i]);
                    array.add(is);
                }
            }
        }

        for (int[] is : array) {

            for (int iter : is) {
                System.out.print(iter + " ");
            }
        }

    }

}
