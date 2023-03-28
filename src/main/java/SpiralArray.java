public class SpiralArray {
    public static void main(String[] args) {
//        int i = new Random().nextInt(122);
//        long t1= System.nanoTime();
//        long t2= System.nanoTime();
//        System.out.println(i);
//        System.out.println(t1);
//        System.out.println(t2);
        int n = 10;
        int m = 10;
        int x = 0;
        int counter = 1;
        int t = 0;
        recursion(n, m, t, counter,x);
//        printLines(getSpiralMatrix(n, m, counter));
    }

    private static void recursion(int n, int m, int t, int counter, int x) {

        if (n > 0 && m > 0) {
            int [][]matrix = getSpiralMatrix(n,m,counter,x);
            counter=getCounter(n,m,counter);

            recursion(n - 2, m - 2, t, counter,x);
            printLines(matrix);
        }
    }

    private static int[][] getSpiralMatrix(int n,int m,int counter,int x) {
            int[][] result = new int[n][m];
        for (int i = 0; i < result.length; i++) {
            int j = 0;
            result[i][j] = counter;
            counter++;
        }
        for (int j = 1; j < result[result.length - 1].length; j++) {
            int i = result.length - 1;
            result[i][j] = counter;
            counter++;
        }

        for (int i = result.length - 2; i > 0; i--) {
            int j = result[result.length - 1].length - 1;
            result[i][j] = counter;
            counter++;


        }

        for (int j = result[result.length - 1].length - 1; j > 0&&result[0][j]==0; j--) {
            int i = 0;
            result[i][j] = counter;
            counter++;

        }

        return result;
    }
    private static int countElements(int[][] getSpiralMatrix){
        int counter =1;
        for (int i = 0; i <0 ; i++) {

        }
        return counter;
    }

    private static void printLines(int[][] lines) {

        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length; j++) {
                System.out.print(String.format(" %3d", lines[i][j]));
            }
            System.out.println();
        }
    }
    private static int getCounter(int n,int m,int counter) {
        int[][] result = new int[n][m];
        for (int i = 0; i < result.length; i++) {
            int j = 0;
            result[i][j] = counter;
            counter++;
        }
        for (int j = 1; j < result[result.length - 1].length; j++) {
            int i = result.length - 1;
            result[i][j] = counter;
            counter++;
        }

        for (int i = result.length - 2; i > 0; i--) {
            int j = result[result.length - 1].length - 1;
            result[i][j] = counter;
            counter++;


        }

        for (int j = result[result.length - 1].length - 1; j > 0&&result[0][j]==0; j--) {
            int i = 0;
            result[i][j] = counter;
            counter++;

        }

        return counter;
    }
}
