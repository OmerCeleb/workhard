package slacksorulari;

import java.util.Scanner;

public class Ödev {
    // kullanicinin verdigi kelimeyi ters cevirelim
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dunyanin en guzel sehrini yaz");
        String sehir = input.nextLine();

        String bosSehir = "";
        for (int i = sehir.length() -1; i > -1; i--) {

            char c = sehir.charAt(i);
            bosSehir = bosSehir + c;

        }
        System.out.print(bosSehir);


    }


}
