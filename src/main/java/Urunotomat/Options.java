package Urunotomat;

import java.util.Scanner;

public class Options extends Urun {

    Scanner input = new Scanner(System.in);

    double accountBalance = 1;         //Kullanici bakiyesi

    //Kullaniciy urun sectirmek

    public void select() {

        System.out.println("\n Lutfen almak istediginiz urunun numarasini giriniz");
        int product = input.nextInt();

        switch (product) {
            case 1:
                price = urunList[0];
                break;
            case 2:
                price = urunList[1];
                break;
            case 3:
                price = urunList[2];
                break;
            case 4:
                price = urunList[3];
                break;
            case 5:
                price = urunList[4];
                break;
            case 6:
                price = urunList[5];
                break;
            case 7:
                price = urunList[6];
                break;
            default:
                System.out.println("Lutfen Sadece urun numaralarini giriniz!");
        }
    }

    //Kullanicinin bakiyesi yetersiz ise bakiye yukleme veya cikis yapma islemi

    public void balance() {

        if (price > accountBalance) {
            System.out.println("Bakiyeniz yetersizdir...\n" +
                    "Bakiyeniz :" + accountBalance + "\n" +
                    "Bakiye yuklemek isterseniz ==> 1\n" +
                    "Cikis yapmak istersniz ==> Q)");
            String islem = input.next().substring(0, 1);
            if (islem.equalsIgnoreCase("1")) {
                System.out.println("Yuklemek istediginiz miktari giriniz");
                double yuklenecekBakiye = input.nextDouble();
                accountBalance = accountBalance + yuklenecekBakiye;
                if (price < accountBalance) {
                    purchace();

                } else {
                    balance();
                }
            } else if (islem.equalsIgnoreCase("Q")) {
                System.out.println("Cikis yapildi...\n" +
                        "\t\t Tekrar bekleriz :)");
            }
        }


    }

    //Kullanicinin bakiyesi alacagi urune yetiyor ise satin alma islemini gerceklestirme veya cikma
    public void purchace() { //accaountBalance >= price ise calisir

        if (accountBalance >= price) {

            System.out.println("Satin alma islemini onayliyorsaniz ==> 1\n" +
                    "Cikis yapmak isterseniz ==> Q");
            String islem = input.next().substring(0, 1);
            if (islem.equalsIgnoreCase("1")) {
                do {
                    if (islem.equalsIgnoreCase("1")) {
                        accountBalance = accountBalance - price;
                        System.out.println("Urunu basariyla satin aldiniz\n" +
                                "Kalan Bakiye : " + accountBalance + "\n\n" +
                                "Baska bir urun satin almak ister misiniz ==> 1\n" +
                                "Cikis yapmak isterseniz ==> Q");
                        String islem2 = input.next().substring(0, 1);
                        if (islem2.equalsIgnoreCase("1")) {
                            toString1();
                            select();
                            purchace();//break; konulabilir geri dön!!

                        } else if (islem2.equalsIgnoreCase("Q")) {
                            break;

                        }
                    }
                }while (islem.equalsIgnoreCase("Q"));
                System.out.println("Cikis yapildi..\n"+
                        "\t\t Tekrar bekleriz :=");
            } else if (islem.equalsIgnoreCase("Q")) {
                System.out.println("Cikis yapildi ...\n"+
                        "\t\tTekrar bekleri :)");

            }
        }else
            balance();


    }


}






