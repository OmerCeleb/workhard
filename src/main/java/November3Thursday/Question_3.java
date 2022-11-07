package November3Thursday;

public class Question_3 {
    //3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
    //Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
    //Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"

    public static void main(String[] args) {

        String psw = "12345678 ";


        String gecerliMi = psw.length() > 8 && !psw.contains(" ") ? "Gecerli" : "Gecersiz";

        System.out.println(gecerliMi);


    }

}
