import javax.xml.parsers.SAXParser;
import java.util.Scanner;
public class Modul01 {
    public static void main(String[] args) {
        kalkulatorprogram();
    }
    public static void kalkulatorprogram(){
        String pilihan;
        int nialai_a = 0;
        int nilai_b = 0;
        double hasil;

        Scanner input_pilihan = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");

        System.out.println("                  ****KALKULATOR****                   ");

        System.out.println("=======================================================");

        System.out.println("Masukan nilai A : ");
        nialai_a = input_pilihan.nextInt();

        System.out.println("Masukan nilai b : ");
        nilai_b = input_pilihan.nextInt();

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");

        System.out.println("Masukkan pilihan [1/2/3]");
        pilihan = input_pilihan.next();

        if (pilihan.equals("1")) {
            System.out.println("Masukkan Nilai A: ");
            nialai_a = input_pilihan.nextInt();
            System.out.println("Masukkan Nilai B: ");
            nilai_b = input_pilihan.nextInt();

            hasil = nialai_a + nilai_b;
            System.out.println("Hasil Penjumlahan adalah : " + hasil);

        } else if (pilihan.equals("2")) {
            System.out.println("Masukkan Nilai A: ");
            nialai_a = input_pilihan.nextInt();
            System.out.println("Masukkan Nilai B: ");
            nilai_b = input_pilihan.nextInt();

            hasil = nialai_a - nilai_b;
            System.out.println("Hasil Penjumlahan adalah : " + hasil);

        }else if (pilihan.equals("3")) {
            System.out.println("Masukkan Nilai A: ");
            nialai_a = input_pilihan.nextInt();
            System.out.println("Masukkan Nilai B: ");
            nilai_b = input_pilihan.nextInt();

            hasil = nialai_a * nilai_b;
            System.out.println("Hasil Penjumlahan adalah : " + hasil);

        }else {
            System.out.println("Pilihan Tidak Ditemukan!");
            System.out.println("-------------Terimakasih--------------");
          }
    }
}
