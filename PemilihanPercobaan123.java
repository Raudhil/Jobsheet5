import java.util.Scanner;

public class PemilihanPercobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        String hasil;
        int angka;

        System.out.print("Masukkan angka: ");
        angka = input23.nextInt();

        hasil = (angka %2 == 0) ? " adalah bilangan genap" : " adalah bilangan ganjil";
        System.out.println(angka + hasil);
       
    

    }
}