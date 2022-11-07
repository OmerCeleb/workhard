package TurkceSoruBankasi;

public class Loop {
    public static void main(String[] args) {

        //1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.


//        for (int i = 120; i > 10; i--) {
//
//            int sayi = 0;
//            sayi = sayi + i;
//
//            if (sayi % 4 == 0 && sayi % 6 == 0) {
//                System.out.print(sayi + " ");
//
//
//            }
//
//            System.out.println();
//        }
//
//        //2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
//        //Örneğin; accessories ´ ces
//
//        String kelime = "accessories";
//        String bosKelime = "";
//
//        for (int i = 0; i < kelime.length() - 1; i++) {
//            char c = kelime.charAt(i);
//
//
//            if (kelime.indexOf(c) != kelime.lastIndexOf(c) ){
//
//                System.out.print(c);
//
//            }
//
//            //3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
//            //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır
//
//
//        String kelime = "anna";
//        String kelimeMI = "";
//        for (int i = kelime.length() - 1; i > -1; i--) {
//            String c = kelime.substring(i, i + 1);
//
//            kelimeMI = kelimeMI + c;
//
//
//        }
//        if (kelime.equals(kelimeMI)) {
//
//            System.out.println(kelime + " Palindrom");
//
//        } else {
//            System.out.println("Palindrom degil");


//             4) Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
//              Örnek; 223878 ´ 37


//        Integer num = 223878;
//        String s = String.valueOf(num);
//        String d ="";
//
//        for (int i = 0 ; i<s.length(); i++){
//
//            String c = s.substring(i,i+1);
//
//            if(s.indexOf(c)==s.lastIndexOf(c) ){
//
//                d=d+c;
//            }
//
//        }
//        System.out.println(d);



//          5) Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//               A A A A A
//               A A A A A
//               A A A A A

         for(int i = 1; i <4 ; i++){
             for (int k = 1 ; k<7 ; k++){
                 System.out.print("A ");


             }
             System.out.println();


         }












        }


    }











