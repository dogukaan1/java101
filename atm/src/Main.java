import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String id="dogukaan";
        String pass="6767";
        int hak=3;
        int secim;
        int bakiye=5000;


        Scanner scan=new Scanner(System.in);
        System.out.println("doğu bankasına hoşgeldiniz ");
        System.out.print("kullanıcı adını giriniz:");
        String kullaniciAdi= scan.next();
        while (hak>0){

        switch (kullaniciAdi){
            case "dogukaan":
                System.out.print("şifrenizi giriniz:");
                String sifre=scan.next();
                switch (sifre){
                    case"6767":
                        System.out.println("yapmak istediğin işlemi seç 1-paraYatırma 2-paraÇekme 3-bakiyeKontrol 4-çıkış ");
                        secim= scan.nextInt();



                            switch (secim) {
                                case 1:
                                    System.out.println("Miktar gir");
                                    int miktar = scan.nextInt();
                                    bakiye += miktar;
                                    System.out.println("güncel miktar: " + bakiye);
                                    break;
                                case 2:
                                    System.out.println("Miktar gir");
                                    int miktar1 = scan.nextInt();
                                    if (miktar1 <= bakiye) {
                                        bakiye -= miktar1;
                                        System.out.println("güncel miktar: " + bakiye);
                                    } else {
                                        System.out.println("bakiye yetersiz!");
                                    }
                                    break;
                                case 3:
                                    System.out.println("güncel bakiye: " + bakiye);



                            break;
                            default:
                        System.out.println("şifrenizi yanlış girdiniz tekrar deneyin");
                        hak--;
                        switch (hak){
                            case 0:
                                System.out.println("hakknız dolmuştur hesap bloke 5300973167 bu numarayı ara");
                                break;

                        }

                }



               }




        }






        }

}}