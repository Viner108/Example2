public class Practice2 {
    /**
     * Идея
     * Программа возвращет новый массив без повторяющихся значений.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] lines = new int[]{};
        printLines(removeDoubleElements(lines));

    }

    public static int[] removeDoubleElements(int[] lines) {
        int[] rejestryArray = getRegestryArray(lines);
        int counter = countElements(rejestryArray);
        return fillArray(lines, rejestryArray, counter);
    }

    private static int[] fillArray(int[] lines, int[] rejestryArray, int counter) {
        int[] result = new int[counter];
        int counter2=0;
        for (int i = 0; i < lines.length; i++) {
            if(rejestryArray[i]==0){
                result[counter2]= lines[i];
                counter2++;
            }
        }
        return result;
    }

    private static int countElements(int[] rejestryArray) {
        int counter = 0;
        for (int j : rejestryArray) {
            if (j == 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] getRegestryArray(int[] lines) {
        int[] rejestryArray = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            int temp = lines[i];
            for (int j = i + 1; j < lines.length; j++) {
                if (temp == lines[j] && i != j) {
                    rejestryArray[j] = 1;
                }
            }
        }
        return rejestryArray;
    }
    private static void printLines(int[] lines){
        System.out.print("[");
        for (int i = 0; i < lines.length; i++) {
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(lines[i]);
        }
        System.out.println("]");
    }
}

