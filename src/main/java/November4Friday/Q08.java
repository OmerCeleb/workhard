package November4Friday;

public class Q08 {
    /*
    8)Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
    b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullan- mayınız"
    c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
    Not: Çözümdeki koşulların sıralarına dikkat ediniz.

     */

    public static void main(String[] args) {

        String password = "1234 ";

        if (!password.contains(" ") && password.length()>8){
            System.out.println("Gecerli Sifre");

        } else if (password.contains(" ") && password.length()>8 ) {
            System.out.println("Sifrede bosluk karakteri kullanmayiniz");

        }else {
            System.out.println("Gecersiz sifre");
        }

    }
}
