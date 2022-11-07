package sorular;

public class Fibonacci {

    //2)Fibonacci dizisindeki her yeni terim, önceki iki terimin
    //eklenmesiyle oluşturulur. 1 ve 2 ile başlayarak, ilk 10 terim şöyle
    //olacaktır:
    //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    public static void main(String[] args) {

        int a = 1;
        int b = 1;

        int fib = 0;
        int count = 0;

        for (int i = 1; i < 10; i++) {

            fib = a + b;
            a = b;

            b = fib;

            System.out.println(fib + " ");

        }


    }

}
