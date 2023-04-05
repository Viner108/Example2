public class SpiralArray {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int x = 0;
        int counter = 1;
        int[][] result = new int[n][m];
        ending1(n, m, x, counter, result);
    }

    private static void ending1(int n, int m, int x, int counter, int[][] result) {
        while (counter <= n * m) {
            counter = getSpiralMatrixX(result, counter, x);
            x++;
        }
        printLines(result);
    }

    private static int getSpiralMatrixX(int[][] result, int counter, int x) {
        int length1 = result.length - x;
        int length2 = result[result.length - 1].length - x;
        for (int i = x; i < length1; i++) {
            int j = x;
            if (result[i][j] == 0) {
                result[i][j] = counter;
                counter++;
            }
        }
        for (int j = 1 + x; j < length2; j++) {
            int i = length1 - 1;
            if (result[i][j] == 0) {
                result[i][j] = counter;
                counter++;
            }
        }
        for (int i = length1 - 2; i > x; i--) {
            int j = length2 - 1;
            if (result[i][j] == 0) {
                result[i][j] = counter;
                counter++;
            }
        }
        for (int j = length2 - 1; j > x; j--) {
            int i = x;
            if (result[i][j] == 0) {
                result[i][j] = counter;
                counter++;
            }
        }
        return counter;
    }

    private static void printLines(int[][] lines) {
        System.out.println();
        for (int[] line : lines) {
            for (int i : line) {
                System.out.printf(" %3d", i);
            }
            System.out.println();
        }
        System.out.println();
    }

}
