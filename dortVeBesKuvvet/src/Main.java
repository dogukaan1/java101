// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, k;
        Scanner can = new Scanner(System.in);
        System.out.println("Sınır belirtiniz: ");
        n = can.nextInt();

        System.out.println("4'ün kuvvetleri");
        for (int i =1; i <=n; i*=4){
            System.out.println(i);
        }

        System.out.println("5'in kuvvetleri");
        for (int i =1; i <=n; i*=5){
            System.out.println(i);
        }
    }
}