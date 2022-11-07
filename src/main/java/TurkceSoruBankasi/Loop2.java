package TurkceSoruBankasi;

import java.util.Arrays;

public class Loop2 {
    public static void main(String[] args) {

        //6) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A
        //A A
        //A A A
        //A A A A

//        for(int i = 1 ; i <5 ; i++ ){
//            for (int k = 1 ; k<=i ; k++){
//                System.out.print(" A");
//            }
//            System.out.println();
//
//
//        }
//
//

        // 7) Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

//
//        int num = 6;
//        for (int i = 1; i < 11; i++) {
//
//            System.out.println(num + "x" + i + "=" + i * num);
//
//
//        }

        //8)20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.


//        for (int i = 20; i > 2; i--) {
//
//
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//
//        }


        //9)String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*

//        String s = "Muzeyyen ASLAN Celebi";
//       for (int i = 0 ; i<s.length() ; i++){
//
//           char c = s.charAt(i);
//           String s1 = "";
//           s1 = s1 + c;
//
//           System.out.print(s1.replaceAll("[a-z]","*"));


        //10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238 ´ *4*2*3*8


//        double no = 75.4233;
//       String no1 = String.valueOf(no);
//       String bos = "";
//
//       for(int i = 0; i < no1.length() ; i++) {
//
//           char d = no1.split(".")[1].charAt(i);
//           bos = bos + d;
//
//           System.out.print(bos);
//

        //11) Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

        //for-loop
//        String str = "Mark";
//        String strT = "";
//
//        for (int i = str.length() - 1; i > -1; i--) {
//
//            strT = strT + str.charAt(i);
//
//
//        }
//        System.out.println(strT);
//
//        //StringBuilder
//        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb.reverse());
//
        //12) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A A A A
        //A X X X X X X A
        //A X X X X X X A
        //A X X X X X X A


        //13) 3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.

//        int sum = 0;
//
//        for (int i = 3; i < 15; i++) {
//
//            sum = sum + i;
//
//
//        }
//        System.out.println(sum);

//        int sum = 0;
//        int i = 3;
//
//        while (i<15){
//        sum = sum + i ;
//
//        i++;
//        }
//        System.out.println(sum);

        //14) 3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.


//        int k = 1;
//
//        for(int i = 3 ; i < 10 ; i++) {
//
//            k = k * i;
//        }
//        System.out.println(k);

        //15) Do-while döngüsünü kullanarak konsolda 'e' ile 'b' arasındaki karakterleri yazdırmak için
        //kod yazınız.


//        char harf = 'e';
//
//        String sonuc ="";
//
//        do{
//            sonuc = sonuc + harf;
//
//            harf--;
//        }while (harf > 'b');
//        System.out.println(sonuc);
//
        //16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.


//      String kelime = "Christmas";
//      String sonuc ="";
//
//   for (int i = 0 ; i < kelime.length() ; i++){
//
//       String c = kelime.substring(i,i+1);
//
//       if(c.equals("m")){
//           break;
//       }
//       sonuc = c + sonuc;
//   }
//        System.out.println(sonuc);


//         17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        int sayi = -1234;
        int sum = 0;

        for (int i = sayi; i < 0; i = i / 10) {


            sum = i % 10 + sum;


        }
        System.out.println(sum);


        //18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //Örneğin; Hello ==> Heo


        String kelime = "abcdabcdx";


        for (int i = 0; i < kelime.length(); i++) {

            String c = kelime.substring(i, i + 1);

            if (kelime.lastIndexOf(c) == kelime.indexOf(c)) {


                System.out.println(c);

            }


        }

        //19) Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.


        String s = "Java is a strongly typed, object-oriented programming language.";
        String c = s.replaceAll(" ", "").replaceAll("\\p{Punct}", "");

        int toplami = c.length();
        System.out.println(toplami);

    }


}









