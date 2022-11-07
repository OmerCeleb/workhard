package November4Friday;

import java.util.ArrayList;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {


        //3) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        List<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(32);
        arr.add(45);
        arr.add(13);
        arr.add(33);

        int sum = 0;
        for (Integer w : arr) {


            if (w == 13){
                break;
            }
            sum = w + sum;


        }
        System.out.print(sum);


    }
}