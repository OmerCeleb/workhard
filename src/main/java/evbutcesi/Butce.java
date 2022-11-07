package evbutcesi;

public class Butce {
    //1 )Basit bir ev bütçesi kodu yazınız.
    //2)Fibonacci dizisindeki her yeni terim, önceki iki terimin
    //eklenmesiyle oluşturulur. 1 ve 2 ile başlayarak, ilk 10 terim şöyle
    //olacaktır:
    //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    //Fibonacci dizisindeki değerleri dört milyonu geçmeyen terimleri
    //dikkate alarak çift değerli terimlerin toplamını bulunuz.
    // 3 )13195'in asal çarpanları 5, 7, 13 ve 29'dur.
    //600851475143 sayısının en büyük asal çarpanı kaçtır?
    //4) Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz. Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
    //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
    //5) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
    //6) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile
    // bölünebilen tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.
    //7) Yazdırmak için switch ifadesini kullanınız.
    //a) Aralık, Ocak, Şubat için "Kış"
    //b) Mart, Nisan, Mayıs için "Bahar"
    //c) Haziran, Temmuz, Ağustos için "Yaz"
    //d) Eylül, Ekim, Kasım için "Güz"
    //e) Diğerleri için "Geçersiz ay adı"

    public static void main(String[] args) {

        EvBUtcesi cocuk = new EvBUtcesi();
        cocuk.burs(1250);


        EvBUtcesi anne = new EvBUtcesi();
        anne.maas(2500);

        EvBUtcesi baba = new EvBUtcesi();
        baba.maas(3000);


        System.out.println("Evin toplam geliri : " + EvBUtcesi.butce);

        EvBUtcesi kira =new EvBUtcesi();
        kira.kira(1750);

        EvBUtcesi faturalar = new EvBUtcesi();

        faturalar.fatura(2500);

        System.out.println("Elimizde kalan para : " +EvBUtcesi.butce);






    }
}
