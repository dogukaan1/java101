import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double ortalama=0;
        double ders=0;
        System.out.println("matematik notunu girin: ");
        double mat=scan.nextDouble();
        if (mat>0&&mat<100){
            ders++;
            ortalama+=mat;

        }


        System.out.println("fizik notunu girin: ");
        double fiz=scan.nextDouble();
        if (fiz>0&&fiz<100){
            ders++;
            ortalama+=fiz;

        }

        System.out.println("tarih notunu girin: ");
        double tar=scan.nextDouble();
        if (tar>0&&tar<100){
            ders++;
            ortalama+=tar;

        }

        System.out.println("kimya notunu girin: ");
        double kim=scan.nextDouble();
        if (kim>0&&kim<100){
            ders++;
            ortalama+=kim;

        }

        System.out.println("biyoloji notunu girin: ");
        double biy=scan.nextDouble();
        if (biy>0&&biy<100){
            ders++;
            ortalama+=biy;

        }
         double ort=   ortalama/ders;
        System.out.println("ortalamanız: "+ort);
        if (ort>=50){
            System.out.println("sınıfı geçtiniz tebrikler");
        }
        else {
            System.out.println("sınıfta kaldın ");
        }

    }
}