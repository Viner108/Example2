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
        boolean direction = false;
        int corner = 1;
        int length1 = result.length - x;
        int length2 = result[result.length - 1].length - x;
        switch (corner){
            case 1:{
                if(direction) {
                    counter = getAnInt1(result, counter, x, length1);
                    counter = getAnInt2(result, counter, x, length1, length2);
                    counter = getAnInt3(result, counter, x, length1, length2);
                    counter = getAnInt4(result, counter, x, length2);
                }else {
                    counter = ReverseSpiralArray.getAnInt1(result, counter, x, length2);
                    counter = ReverseSpiralArray.getAnInt2(result, counter, x, length1, length2);
                    counter = ReverseSpiralArray.getAnInt3(result, counter, x, length1, length2);
                    counter = ReverseSpiralArray.getAnInt4(result, counter, x, length1);
                }
                break;
            }
            case 2:{

            }
            case 3:{

                break;
            }
            case 4:{

                break;
            }
        }
        return counter;
    }

    private static int getAnInt4(int[][] result, int counter, int x, int length2) {
        for (int j = length2 - 1; j > x; j--) {
            int i = x;
            counter = getCounter(result, counter, j, i);
        }
        return counter;
    }

    private static int getAnInt3(int[][] result, int counter, int x, int length1, int length2) {
        for (int i = length1 - 2; i > x; i--) {
            int j = length2 - 1;
            counter = getCounter(result, counter, j, i);
        }
        return counter;
    }

    private static int getAnInt2(int[][] result, int counter, int x, int length1, int length2) {
        for (int j = 1 + x; j < length2; j++) {
            int i = length1 - 1;
            counter = getCounter(result, counter, j, i);
        }
        return counter;
    }

    private static int getAnInt1(int[][] result, int counter, int x, int length1) {
        for (int i = x; i < length1; i++) {
            int j = x;
            counter = getCounter(result, counter, x, i);
        }
        return counter;
    }

    private static int getCounter(int[][] result, int counter, int j, int i) {
        if (result[i][j] == 0) {
            result[i][j] = counter;
            counter++;
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
