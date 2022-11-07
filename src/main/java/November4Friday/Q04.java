package November4Friday;

import java.util.Arrays;

public class Q04 {
//    4)String' lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
    //  Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

    public static void main(String[] args) {

        String[] isimler = {"Kemal", "Jonathan", "Mark", "Angie", "Veli" };

        int minLength = isimler[0].length();


        for (String w : isimler) {
            minLength = Math.min(minLength, w.length());


        }
        for (String w : isimler) {

            if( minLength == w.length()){
                System.out.print(w);
            }

        }

    }

}
