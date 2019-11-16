package com.maratorajava.introducao;

public class Arrays2 {
    public static void main(String[] args) {
        int[] simpleArray = new int[]{0, 1, 2, 3, 4};
        int[][] multiArray = new int[5][];
//        int[][] multiArray = new int[][]{simpleArray, simpleArray};

        for (int c = 0; c < multiArray.length; c++) {
//            multiArray[c] = simpleArray;
            multiArray[c] = simpleArray.clone();
        }

        simpleArray[0] = 9999;

        for (int[] arr : multiArray) {
            System.out.println("New Array");
            for (int value : arr) {
                System.out.println(value);
            }
        }
    }
}
