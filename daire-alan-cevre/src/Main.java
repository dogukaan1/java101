import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("yarıçap gir: ");
        double r=scan.nextDouble();
        double alan= 3.14*r*r;
        System.out.println("alan: "+alan);
        double cevre= 3.14*2*r;
        System.out.println("cevre: "+cevre);


    }
}