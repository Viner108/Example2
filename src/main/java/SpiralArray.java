public class SpiralArray {
    public static void main(String[] args) {
//        int i = new Random().nextInt(122);
//        long t1= System.nanoTime();
//        long t2= System.nanoTime();
//        System.out.println(i);
//        System.out.println(t1);
//        System.out.println(t2);
        int n = 5;
        int m = 5;
        printLines(getSpiralMatrics(n, m));
    }

    private static int[][] getSpiralMatrics(int n, int m) {
        int[][] result = new int[n][m];
        int counter = 1;
        for (int i = 0; i < result.length; i++) {
            result[i][0] = counter;
            counter++;
            if (i == result.length - 1) {
                for (int j = 1; j < result[i].length; j++) {
                    result[i][j] = counter;
                    counter++;
                }
            }
        }
        for (int i = result.length-2; i > 0; i--) {
            for (int j = result[result.length - 1].length - 1; j > 0; j--) {
                result[i][j] = counter;
                counter++;
                break;
            }
        }

            for (int j = result[result.length - 1].length - 1; j > 0; j--) {
                result[0][j] = counter;
                counter++;


            }
//        result[0][result[result.length-1].length-1]=4;
        return result;
    }

    private static void printLines(int[][] lines) {

        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length; j++) {
                System.out.print(lines[i][j]);
            }
            System.out.println();
        }
    }
}
