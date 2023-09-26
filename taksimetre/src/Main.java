import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("km giriniz: ");
        double km =scan.nextDouble();
        double tutar=km*2.20+10;
        if (tutar>=20){
            System.out.println("tutar: "+tutar);
        } else if (tutar<20) {

            System.out.println("tutar: "+20);
        }

    }
}