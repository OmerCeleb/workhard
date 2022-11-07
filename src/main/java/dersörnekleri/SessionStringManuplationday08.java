package dersörnekleri;

import java.util.Scanner;

public class SessionStringManuplationday08 {

    public static void main(String[] args) {
        //Example 1:
        //1.Yol:

       Scanner input = new Scanner(System.in);
//        System.out.println("Isminizi giriniz");
//        String isim = input.next();
//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length() - 1);
//        System.out.println("" + ilkHarf + sonHarf);
//
//        //2. Yol;
//        String ilk = isim.substring(0,1);
//        String son = isim.substring(isim.length()-1,isim.length());


        //Example 2: Verilen String'deki sadece hayvan isimlerini ekrana yazdiriniz.
        //                     "Ben kedi esim tavuk oglum inek sever"

//        String str = "Ben kedi, esim tavuk, oglum sever inek";
//
//       String kedi = str.substring(4,8);
//       String tavuk = str.substring(15,20);
//       String inek = str.substring(34);
//
//        System.out.println(kedi + inek + tavuk);
//
//
//        //Example 3:
//
//        System.out.println("Lutfen isim ve soy isminizi giriniz");
//        String isimSoyisim = input.nextLine();
//
//        String ilkHarf = isimSoyisim.substring(0,1);
//        String soyIlkHarf = isimSoyisim.split(" ")[1].substring(0,1);
//
//        System.out.println(ilkHarf+soyIlkHarf);
//
//

       // Example 4:

//        String str = "Ali ata bak";
//
////        int str2 = str.replace(" ","").length();
////        System.out.println(str2);
//
//        //Example 5:
//        String str2 = str.replace("a","A");
//        System.out.println(str2);
//        String s = "Ankara'nin tasina gözlerimin yasina bak";
//        String s2 = s.replace("kara","*");
//        System.out.println(s2);

        //Example 6:
//        String sayi = "12345abcd";
//        String sayi2 = sayi.replaceAll("[0-9]","*");
//        System.out.println(sayi2);

//        String bla = "abcde1 234.,-<";
//        String bla2 = bla.replaceAll("[0-9]","").replace(" ","").replaceAll("[\\p{Punct}]","");
//        System.out.println(bla2);



        //Example 7:
//        String pwd = "1asdfgc3 *A";
//
//        boolean space = pwd.replace(" ","").length()<7;
//
//        boolean rakam = pwd.replaceAll("[A-Za-z \\p{Punct}]","").length()>0;
//        System.out.println(rakam);
//
//        boolean buyukHarf = pwd.replaceAll("[a-z \\p{Punct}0-9]","").length()>0;
//        System.out.println(buyukHarf);
//
//
//
//
//        String str = ".,!?12345";
//        int sayi = str.replaceAll("[\\p{Punct}]","").length();
//        System.out.println(sayi);
//

        String kelime = "Ale";
        if(kelime.startsWith("Al") && kelime.endsWith("x")){
            System.out.println("Harika");

        }else {
            System.out.println("bok");
        }

























    }


}
