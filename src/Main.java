import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut=2.14,a;
        double elma=3.67,e;
        double domates=1.11,d;
        double muz=0.95,m;
        double patlican=5,p;
        double tutar;

            Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? ");
        a = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? ");
        e = inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? ");
        d = inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? ");
        m = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? ");
        p = inp.nextDouble();

        tutar = ((float) (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patlican));
        System.out.println("Toplam Alışveriş Tutarı : "+tutar);
    }
}