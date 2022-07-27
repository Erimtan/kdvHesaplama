import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double fiyat,kdv,kdvTutar,kdvToplam;

        System.out.print("Fiyat'i giriniz: ");
        fiyat = inp.nextDouble();

        kdv = fiyat > 1000 ? 0.08 : 0.18;
        kdvTutar = fiyat * kdv;
        kdvToplam = fiyat + kdvTutar;

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV'li Fiyat: " + kdvToplam);
        System.out.println("KDV Orani: " + kdv);
        System.out.println("KDV Tutari: " + kdvTutar);
    }
}
