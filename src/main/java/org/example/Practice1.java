package org.example;

public class Practice1 {
    /**
     * Идея
     * Программа находит число в массиве и говорит его индекс.
     */
    public static void main(String[] args) {
        int[] lines = new int[]{1, 2, 3, 4};
        int t = 4;

        for (int i = 0; i < lines.length; i++) {
            if (lines[i] == t) {
                System.out.println("Индекс числа в массив равен " + i);
                break;
            }
            }
        }
    }

