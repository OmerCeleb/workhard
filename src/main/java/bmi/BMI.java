package bmi;

public class BMI {

    private double kilo;
    private double boy;

    public BMI(double kilo, double boy) {

        this.kilo = kilo;
        this.boy = boy;


    }

    public BMI() {


    }

    public double getKilo() {
        return kilo;
    }

    public double getBoy() {
        return boy;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public void BIMHesapla() {

        double BMI = kilo / (boy * boy);

        System.out.println("BMI " + BMI);
        if (BMI > 0 && BMI < 18.5) {
            System.out.println("Zayif");
        } else if (BMI > 18.5 && BMI < 25) {
            System.out.println("Normal");
        } else if (BMI > 25 && BMI < 30) {
            System.out.println("Kilolu");
        }else if (BMI >= 30){
            System.out.println("Obez");
        }else {
            System.out.println("Gecersiz deger girdiniz.");
        }

    }

    @Override
    public String toString() {
        return "BMI{" +
                "kilo=" + kilo +
                ", boy=" + boy +
                '}';
    }
}
