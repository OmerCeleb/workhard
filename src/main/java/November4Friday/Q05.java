package November4Friday;

public class Q05 {
    //5)Bir String' de tekrarlanan karakterleri yazdırmak için kod yazınız. Örneğin; accessories  ́ ces

    public static void main(String[] args) {

        String a = "accessories";
        String b = "";

        for (int i = 0; i < a.length(); i++) {

            String c = a.substring(i,i+1);

            if (a.indexOf(c) != a.lastIndexOf(c)){

                if (!b.contains(c)){

                    b=b+c;
                }

            }


        }
        System.out.println(b);
    }
}
