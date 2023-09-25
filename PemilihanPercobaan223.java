import java.util.Scanner;

public class PemilihanPercobaan223 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

    System.out.print("Masukkan nilai: ");
    float nilai = input23.nextFloat();

    if(nilai > 80 && nilai <= 100){
        System.out.println("Nilai huruf A, Nilai setara 4, Kualifikasi Sangat baik.");
    }   else if(nilai > 73 && nilai <= 80){
            System.out.println("Nilai huruf B+, Nilai setara 3,5, Kualifikasi Lebih dari baik.");
    }   else if(nilai > 65 && nilai <= 73){
            System.out.println("Nilai huruf B, Nilai setara 3, Kualifikasi Baik.");
    }   else if(nilai > 60 && nilai <= 65){
            System.out.println("Nilai huruf C+, Nilai setara 2,5, Kualifikasi lebih dari cukup.");
    }   else if(nilai > 50 && nilai <= 60){
            System.out.println("Nilai huruf C, Nilai setara 2, Kualifikasi Cukup.");
    }   else if(nilai > 39 && nilai <= 50){
            System.out.println("Nilai huruf D, Nilai setara 1, Kualifikasi Kurang.");
    }   else if(nilai <= 39){
            System.out.println("Nilai huruf E, Nilai setara 0, Kualifikasi Gagal.");
    } else{
        System.out.println("Error.");
    }

    }
        
}






   








    
