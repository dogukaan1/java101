import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthYear, zodyag;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        birthYear = inp.nextInt();
        zodyag = birthYear % 12;

        if (zodyag == 0) {
            System.out.println("Maymun");
        } else if (zodyag == 1) {
            System.out.println("Horoz");
        } else if (zodyag == 2) {
            System.out.println("Köpek");
        } else if (zodyag == 3) {
            System.out.println("Domuz");
        } else if (zodyag == 4) {
            System.out.println("Fare");
        } else if (zodyag == 5) {
            System.out.println("Öküz");
        } else if (zodyag == 6) {
            System.out.println("Kaplan");
        } else if (zodyag == 7) {
            System.out.println("Tavşan");
        } else if (zodyag == 8) {
            System.out.println("Ejderha");
        } else if (zodyag == 9) {
            System.out.println("Yılan");
        } else if (zodyag == 10) {
            System.out.println("At");
        } else if (zodyag == 11) {
            System.out.println("Koyun");

        }
        System.out.println("Çin Zodyağı Burcunuz: " + zodyag);

    }
}