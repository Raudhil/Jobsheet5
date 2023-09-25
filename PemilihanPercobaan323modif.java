import java.util.Scanner;

public class PemilihanPercobaan323{
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        double angka1,angka2,hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = input23.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input23.nextDouble();

        System.out.print("Masukkan operator(+ - * /): ");
        operator = input23.next().charAt(0);

    switch (operator){
        case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
<<<<<<< HEAD
        case '-':
=======
            break;
            case '-':
>>>>>>> 202dbe6a6113dca312c378c336f48c36fc5a837a
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
            break;
            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;
    }

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 202dbe6a6113dca312c378c336f48c36fc5a837a
