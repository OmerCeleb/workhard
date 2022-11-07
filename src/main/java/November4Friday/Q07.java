package November4Friday;

public class Q07 {
    //7)Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
    //a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
    //b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
    //c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 1;


        String ucgen = a==b && b==c ? "Eskenar ucgen" : (a==b && b!=c || b==c && a!=c || c==a && b!=a ? "Ikizkenar ucgendir" : "Cesit kenar ucgen");
        System.out.println(ucgen);
    }
}
