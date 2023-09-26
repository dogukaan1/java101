import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("mesafeyi giriniz: ");
        double km = scan.nextDouble();

        System.out.println("yaş giriniz: ");
        double yas = scan.nextDouble();

        System.out.println("yolculuk tipi giriniz tek yön:1 gidiş dönüş:2 ");
        int secim = scan.nextInt();


        double ucret=km*0.1;
        System.out.println("mesafe başına ücret: "+ucret);
if(secim==1) {
    if (yas < 12) {
        double indirim = ucret / 2;
        ucret = ucret - indirim;

        System.out.println("ödenecek ücret: " + ucret);

    } else if (yas >= 12 && yas < 24) {
        double indirim = ucret * 0.1;
        ucret = ucret - indirim;
        System.out.println("ödenecek ücret: " + ucret);

    } else if (yas >= 65) {
        double indirim = ucret * 0.3;
        ucret = ucret - indirim;
        System.out.println("ödenecek ücret: " + ucret);
    }
} else if (secim==2) {
    if (yas < 12) {
        double indirim = ucret*2 / 2;
        ucret = ucret - indirim;
        double tip=ucret*0.2;
        ucret = ucret - tip;
        System.out.println("ödenecek ücret: " + ucret);

    } else if (yas >= 12 && yas < 24) {
        double indirim = ucret*2 * 0.1;
        ucret = ucret - indirim;
        double tip=ucret*0.2;
        ucret = ucret - tip;
        System.out.println("ödenecek ücret: " + ucret);

    } else if (yas >= 65) {
        double indirim = ucret*2 * 0.3;
        ucret = ucret - indirim;
        double tip=ucret*0.2;
        ucret = ucret - tip;
        System.out.println("ödenecek ücret: " + ucret);
    }


}
else{
    System.out.println("yanlış seçtin sadece 1 ve 2");
}


    }
}