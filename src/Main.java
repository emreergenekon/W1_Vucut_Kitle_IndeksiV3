import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {

//değerlerin belirlenmesi
        double kg;
        double boy;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg = input.nextDouble();

//vücut kitle indeksi formülü
        double vki = kg / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki );

    }
}