package November3Thursday;

import java.util.Scanner;

public class Questions_4 {

    //4)1) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    //a) Aralık, Ocak, Şubat için "Kış"
    //b) Mart, Nisan, Mayıs için "İlkbahar"
    //c) Haziran, Temmuz, Ağustos için "Yaz"
    //d) Eylül, Ekim, Kasım için "Sonbahar"
    //e) Diğerleri için "Geçersiz ay adı"

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String aylar = input.next();

        switch (aylar){

            case "ocak" :
                System.out.println("Kis");
            case "subat":
                System.out.println("Kis");
            case "mart":
                System.out.println("Kis");
            case "aralik":
                System.out.println("Kis");
            case "Haziran":
                System.out.println("Yaz");
            case "temmuz":
                System.out.println("Yaz");
            case "agustos":
                System.out.println("Yaz");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz...");


        }


    }

}
