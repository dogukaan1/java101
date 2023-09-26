import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("matematik:");
        int mat = scan.nextInt();

        System.out.print("türkçe:");
        int tr = scan.nextInt();

        System.out.print("fizik:");
        int fiz = scan.nextInt();

        System.out.print("kimya:");
        int kim = scan.nextInt();

        int tpl= mat+tr+fiz+kim;
        int ort=tpl/4;
        String snc = ort >60 ? "Geçti " : "Geçmedi";
        System.out.println(snc);

        }
    }
