import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("boy gir: ");
        double boy=scan.nextDouble();

        System.out.println("kilo gir: ");
        double kilo=scan.nextDouble();

        double boykare=boy*boy;

        double index=kilo*boykare;
        System.out.println(index);

    }
}