import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String userName="dogu67";
        String password="iboibo";

        Scanner scan=new Scanner(System.in);

        int hak =3;
        while (hak>=0) {
            System.out.println("kullanıcı adı gir: ");
            String user=scan.next();
            System.out.println("sifre gir: ");
            String pass=scan.next();
            if (user.equals(userName) && pass.equals(password) ) {
                System.out.println("giriş başarılı");
                break;
            } else {
                hak--;
                System.out.println("yanlış girdiniz tekrar deneyin");
            }
        }



    }
}