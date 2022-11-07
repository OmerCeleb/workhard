package evbutcesi;

public class EvBUtcesi{


    public static int butce;



    public void maas(int maas) {

        butce += maas;

    }

    public void burs(int okulBursu) {

        butce += okulBursu;

    }

    public void fatura(int fatura) {

        butce -= fatura;

    }

    public void kira(int kira) {
        butce -= kira;
    }


}
