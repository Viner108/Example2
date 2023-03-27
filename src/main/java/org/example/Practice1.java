package org.example;

public class Practice1 {
    /**
     * Идея
     * Программа находит число в массиве и говорит его индекс.
     */
    public static void main(String[] args) {
        int[] lines = new int[]{1, 2, 3, 4};
        int element = 0;
        if(getAdessByElement(lines,element)<0){
            System.out.println("Такого числа нет в массиве");
        }else{
            System.out.println("Индекс числа в массив равен " + getAdessByElement(lines,element));
        }
    }

    public static int getAdessByElement(int[] lines, int element) {

        for (int i = 0; i < lines.length; i++) {
            if (lines[i] == element) {

                return i;
            }
        }
        return -1;
    }
}

