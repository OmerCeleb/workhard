package TurkceSoruBankasi;

public class TernaryStatement {
    public static void main(String[] args) {


        // 1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //       Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        //     Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
        String psw = "123456789";

        //.replaceAll()
        String sonuc = psw.length() > 7 ? "Gecerli" : "Gecersiz";
        System.out.println(sonuc);


        //2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        //b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        //c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "

//        int a = 13;
//        int b = 13;
//        int c = 14;
//
//
//        if (a == b && b == c && c == b) {
//            System.out.println("Eskenar ucgen");
//        } else if (a == b || c == b || a == b) {
//            System.out.println("Ikizkenar ucgen");
//
//        } else {
//            System.out.println("Cesitkenar ucgen");
//        }
//
//
//
//
//
//
//        String ucgen = a==b && b==c ? "Eskenar ucgen" : (b!=a && c==a || c!=a && b==a || a!=b && c==a ? "Ikizkenar" : "Cesitkenar");
//
//
//        System.out.println(ucgen);


        //3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        //a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        //b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        //Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        // 125 yukarı yuvarlanacak ve değer 130 olacaktır.
        // 123 aşağı yuvarlanacak ve değer 120 olacaktır.

//        int sayi = 123;
//
//        String sonuc1 =(sayi % 10 >= 5 ? ("Son basamagi bir ust ondaliga yuvarla " + (sayi/10+1)*10) :
//                ("Son basamagi bir alt ondalik sayiya yuvarla " + (sayi/10)*10));
//
//        System.out.println(sonuc1);


        //4) Nested Ternary kullanarak Apex kodunu yazınız.
        //Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        //Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
        //Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir


//                    int yil = 1975;
//
//        boolean artikYil = (yil % 100 == 0 ? (yil %400 == 0) : (yil % 4 == 0));
//
//        System.out.println("artikYil = " + artikYil);



        //5)Nested Ternary kullanarak;
        //Şifreyi kontrol etmek için kodu yazınız.
        //8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        //8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdı

//
//        String sifre = "12345";
//
//        String basHarf = sifre.length() > 8 ? sifre.charAt(0)== 'i'? "Gecerli" : "Gecersiz": sifre.charAt(0) == 'K' ? "Gecerli" : "Gecersiz"
//                ;
//        System.out.println(basHarf);
//
//

        //6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        //Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        //Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız
        
        
//        int sayi = -25;
//
//        int mutlak = sayi <= 0 ? sayi*(-1) : sayi;
//
//        System.out.println("mutlak = " + mutlak);
//
//        //7) Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.
//        int a = 21;
//        int b = 23;
//        int x = a+ 0 ;
//        int y = b + 0;
//
//        int kucukMU =  a<b ? x : y;
//        System.out.println(kucukMU);
//        //
//        int i = 13, k =12;
//        int buyukMu = i<k ? i : k;
//        System.out.println(buyukMu);



    }


}
