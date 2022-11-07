package TurkceSoruBankasi;

import java.util.Arrays;

public class ArraysSorualri {
    public static void main(String[] args) {

//        //1) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
//        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
//        // (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
//
//
//        int a[] = new int[]{12, 5,8, 13};
//
//        Arrays.sort(a);
//
//        if (a.length % 2 != 0) {
//            int ortadakiIndex = a.length / 2;
//            System.out.println(a[ortadakiIndex]);
//
//        } else {
//            int ortadakiIndex = a.length / 2;
//            Integer ortadakiEleman = (a[ortadakiIndex] + a[ortadakiIndex - 1])/2;
//            System.out.println(ortadakiEleman);
//
//
//        }
//        {

        //2) String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        //Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

        String[] names = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int minuzunluk = names[0].length();

        for (String w : names) {

            minuzunluk = Math.min(minuzunluk, w.length());

        }

        for (String w : names) {

            if (minuzunluk == w.length()) {

                System.out.println(w);

            }

        }
        System.out.println();


        //3 Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
        //bulunuz.
        //Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        int numbers[] = {-12, 18, -5, 23, -2};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int maxNegatif = numbers[0];
        int minPozitif = numbers[numbers.length - 1];

        for (int w : numbers) {

            if (w < 0) {

                maxNegatif = Math.max(maxNegatif, w);
            }
            if( w > 0 ){

                minPozitif = Math.min(minPozitif , w);

            }

        }
        System.out.println("maxNegatif " + maxNegatif);
        System.out.println("min Pozitif " + minPozitif);

        System.out.println();


        //4) String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //alınız.









    }


}










