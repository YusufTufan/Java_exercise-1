import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz:");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();

        int gecici = 0;

        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("ilk sayı:"+ sayi1);
        System.out.println("ikinci sayı:"+sayi2);
    }
}