import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float KM, KMTutari, TotalBorc;
        int AcilisUcreti;


        Scanner inp = new Scanner(System.in);

        AcilisUcreti = 10;
        System.out.println("Açılış Ücreti : 10 TL");

        System.out.print("Gidilen KM Bilgisini Giriniz : ");
        KM = inp.nextFloat();

        KMTutari = (2.20f * KM);
        System.out.println("KM Tutarı : " + KMTutari + "TL");

        TotalBorc = (AcilisUcreti + KMTutari);
        boolean MinTutar = KMTutari < 20;
        System.out.println(MinTutar ? "Toplam Ödenecek Miktar : " + 20 + " TL " : "Toplam Ödenecek Miktar : " + TotalBorc + " TL ");
    }
}
