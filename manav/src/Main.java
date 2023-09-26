import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("armut kilo gir: ");
        double armut=scan.nextDouble();
        double afiyat=armut*2.14;

        System.out.println("muz kilo gir: ");
        double muz=scan.nextDouble();
        double mfiyat=muz*0.95;

        System.out.println("patlıcan kilo gir: ");
        double patlican=scan.nextDouble();
        double pfiyat=patlican*5;

        System.out.println("domates kilo gir: ");
        double domates=scan.nextDouble();
        double dfiyat=domates*1.11;

        System.out.println("elma kilo gir: ");
        double elma=scan.nextDouble();
        double efiyat=elma*3.67;

        double tpl=afiyat+mfiyat+pfiyat+dfiyat+efiyat;

        System.out.println("toplam tutar: "+tpl);


    }
}