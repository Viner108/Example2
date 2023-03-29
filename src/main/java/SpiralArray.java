public class SpiralArray {
    public static void main(String[] args) {
//        int i = new Random().nextInt(122);
//        long t1= System.nanoTime();
//        long t2= System.nanoTime();
//        System.out.println(i);
//        System.out.println(t1);
//        System.out.println(t2);
        boolean x1 = and(true, false);
        boolean x2 = and(false, false);
        boolean x3 = and(and(true, and(and(true, false), true)), false);
        boolean x4 = and(and(true, and(and(and(true, false), false), and(true, false))), and(true, false));
        boolean x5 = and(and(or(true, false), and(or(and(true, false), false), and(true, false))), and(true, false));
        int n = 10;
        int m = 10;
        int x = 0;
        int counter = 1;
        int t = 0;
//        recursion(n, m, t, counter,x);
       int [][] result =new int[n][m];
//       int r1 =getSpiralMatrixX(result,counter,x);
        while (counter<=n*m){
            counter = getSpiralMatrixX(result,counter,x);
           x++;

        }
    }
    private static boolean and(boolean x1, boolean x2){
        return x1&&x2;
    }

    private static boolean or(boolean x1, boolean x2){
        return x1||x2;
    }
    private static int getSpiralMatrixX(int[][] result ,int counter,int x) {
        int length1=result.length-x;
        int length2=result[result.length-1].length-x;
        for (int i = 0+x; i < length1; i++) {
            int j = 0+x;
            if(result[i][j] ==0) {
                result[i][j] = counter;
                counter++;
            }

        }
        for (int j = 1+x; j < length2; j++) {
            int i = length1-1;
            if(result[i][j] ==0) {
                result[i][j] = counter;
                counter++;
            }
        }

        for (int i = length1 - 2; i > 0+x; i--) {
            int j = length2-1;
            if(result[i][j] ==0) {
                result[i][j] = counter;
                counter++;
            }

        }

        for (int j = length2 - 1; j > 0+x; j--) {
            int i = 0+x;
            if(result[i][j] ==0) {
                result[i][j] = counter;
                counter++;
            }
        }
        printLines(result);

        return counter;
    }


    private static void recursion(int n, int m, int t, int counter, int x) {

        if (counter<(n*m)) {
            x++;
            int [][]matrix = getSpiralMatrix(n,m,counter,x);
            counter=getCounter(n,m,counter);

            recursion(n, m, t, counter,x);
            printLines(matrix);
        }
    }

    private static int[][] getSpiralMatrix(int n,int m,int counter,int x) {
            int[][] result = new int[n][m];
            int length1=result.length-2*x;
            int length2=result[result.length-1].length-2*x;
        for (int i = 0+x; i < length1; i++) {
            int j = 0+x;
            result[i][j] = counter;
            counter++;
        }
        for (int j = 1+x; j < length2; j++) {
            int i = length1 - 1;
            result[i][j] = counter;
            counter++;
        }

        for (int i = length1 - 2; i > 0; i--) {
            int j = length2 - 1;
            result[i][j] = counter;
            counter++;


        }

        for (int j = length2 - 1; j > 0&&result[0][j]==0; j--) {
            int i = 0+x;
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
        System.out.println();
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length; j++) {
                System.out.print(String.format(" %3d", lines[i][j]));
            }
            System.out.println();
        }
        System.out.println();
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
