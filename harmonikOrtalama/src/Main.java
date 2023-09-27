import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.println("n sayısını giriniz: ");
        int n = can.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result += (1 / i);   // Her adımda, serinin bir sonraki terimi olan 1/i değeri result değişkenine eklenir.
        }
        System.out.println(result);
    }
}