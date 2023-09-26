import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sıcaklığı gir: ");
        double sicak= scan.nextDouble();

        if (sicak<=5){
            System.out.println("kayak yap");

        } else if (sicak>5||sicak<=15) {
            System.out.println("sinemaya git");

        } else if (sicak>15||sicak<=25) {
            System.out.println("pikniğe git");
            
        } else if (sicak>25) {
            System.out.println("plaja git");

        }

    }
}