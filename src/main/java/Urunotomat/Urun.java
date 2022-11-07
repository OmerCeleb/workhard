package Urunotomat;

public class Urun {

    //Urunler

    public double urunList[] = {2.5, 2.2, 2.2, 2.0, 1.0, 1.5, 1.99};

    double kraker = 2.5;
    double cips = 2.2;
    double cocaCola = 2.2;
    double fanta = 2.0;
    double su = 1.0;
    double cay = 1.5;
    double filtreKahve = 1.99;

    public double productNum;
    public static double price;

    //urunlerin konsolda gösterilmesi

    public void toString1() {

        System.out.println("\t----Urunler----\n" +
                "1-Kraker = 2.5 Tl\n" +
                "2-Cips = 2.2Tl\n" +
                "3-CocaCola = 2.2Tl\n" +
                "4-Fanta = 2.0 TL\n" +
                "5-Su = 1.0 TL \n" +
                "6-Cay = 1.5 TL\n" +
                "7-Filtre Kahve = 1.99 TL");
    }


}
