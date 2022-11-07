package Q01;

import java.util.Scanner;

public class Q01Switch_Question {

    //Q1-) Girilen ay ve yil numarasina göre ayin kac gun oldugnu yazdiran kodu yaziniz
    //              Girdi yil: 2000              Ay: 2                Cikti:29


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz.");
        int year = input.nextInt();
        System.out.println("Lutfen bir ay numarasi giriniz.");
        int month = input.nextInt();

        int day;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                System.out.println("Girdiginiz ay da " + day + " gun vardir.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                System.out.println("Girdiginiz ay da " + day + " gun vardir.");
                break;
            case 2:
                if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
                    day = 29;
                    System.out.println("Girdiginiz ay da " + day + " gun vardir.");

                } else {
                    day = 28;
                    System.out.println("Girdiginiz ay da " + day + " gun vardir.");
                }
                break;
            default:
                System.out.println("Lutfen gecerli bir ay ve yil numarasi giriniz. ");

        }


    }
}