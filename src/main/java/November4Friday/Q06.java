package November4Friday;

import java.util.Scanner;

public class Q06 {
    //6)Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız. Örneğin;
    //kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
    //kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
    //Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay numarasi girer misiniz");
        int ayNumarasi = input.nextInt();



        switch (ayNumarasi){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 4:
                System.out.println("Mart");
                break;
            case 5:
                System.out.println("Nisan");
                break;
            case 6:
                System.out.println("Mayis");
                break;
            case 7:
                System.out.println("Haziran");
                break;
            case 8:
                System.out.println("Temmuz");
                break;
            case 9:
                System.out.println("Agustos");
                break;
            case 10:
                System.out.println("Eylul");
                break;
            default:
                System.out.println("Gecersiz Numara");


        }
    }
}
