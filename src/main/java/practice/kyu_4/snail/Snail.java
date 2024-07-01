package practice.kyu_4.snail;

import java.util.ArrayList;
import java.util.Arrays;

public class Snail {
    public static int[] snail(int[][] array) {

        if (Arrays.stream(array).allMatch(i -> i.length == 0)) return new int[0];


        ArrayList<Integer> result = new ArrayList<>();

        int row = 0;
        int col = -1;
        int move = 1;
        int max = array.length;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < max; j++) {
                col += move;
                result.add(array[row][col]);
            }
            max--;
            for (int j = 0; j < max; j++) {
                row += move;
                result.add(array[row][col]);
            }
            move *= -1;
        }

        int [] arrbuff = new int[array.length * array.length];

        for (int i = 0; i < array.length * array.length; i++) {
            arrbuff[i] = result.get(i);
        }

        return arrbuff;
    }
}
