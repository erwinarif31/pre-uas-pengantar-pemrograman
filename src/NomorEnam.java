public class NomorEnam {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 1}, { 4, 5}, { 7, 8} };
        int[][] arr2 = { { 1, 3}, { 2, 4} };
        int row1 = arr1.length;
        int row2 = arr2.length;
        int col1 = arr1[0].length;
        int col2 = arr2[0].length;

        int[][] result = new int[row1][col2];
        if (col1 == row2) {

            /** Perkalian Matriks */
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        result[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        } else {
            System.out.println("Perkalian tidak dapat dilakukan!");
        }

        /** Print Hasil Perkalian Tiap Elemen */
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.printf("%4d ", result[i][j]);
            }
            System.out.println();
        }
    }
}
