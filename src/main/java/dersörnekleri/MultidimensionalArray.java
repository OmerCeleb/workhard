package dersörnekleri;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {


        //1)
        int[][] arr = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};

        int sum = 0;
        for (int[] w : arr) {

            for (int k : w) {

                sum = sum + k;
            }


        }
        System.out.println(sum);
        System.out.println();

        //2)

        int[][] brr = {{2, 5, 1}, {32, 75}};

        int elemanSayisi = 0;

        for (int[] w : brr) {

            elemanSayisi = elemanSayisi + w.length;

        }
        System.out.println(elemanSayisi);

        int idx = 0;
        int[] crr = new int[5];

        for (int[] w : brr) {

            for (int k : w) {

                crr[idx] = k;

                idx++;

            }

        }
        System.out.println(Arrays.toString(crr));


        //3

        int[][] drr = {{2, 5, 1}, {32, 83}};

        int maxElement = drr[0][0];

        for (int[] w : drr) {

            for (int k : w) {

                maxElement = Math.max(maxElement, k);

            }


        }
        System.out.println(maxElement);




    }
}























