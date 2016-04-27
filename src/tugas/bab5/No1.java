package bab5;
import java.util.Scanner;
public class No1 {
    public static void main(String[] args) {
        Menghitung angka = new Menghitung();
        Scanner in = new Scanner(System.in);
        int n;
        do{
        System.out.println("Menu");
        System.out.println("1.Perkalian");
        System.out.println("2.Pembagian");
        System.out.println("3.Penumlahan");
        System.out.println("4.Pengurangan");
        System.out.println("5.Mensederhanakan");
        System.out.println("0.Keluar");
        System.out.print("Masukkan Urutan = ");
        n = in.nextInt();
        switch(n){
            case 1 :
            System.out.print("masukkan A : ");
            int n1 = in.nextInt();
            System.out.print("masukkan B : ");
            int n2 = in.nextInt();
            angka.pekalian(n1, n2);
            break;
            case 2 :
            System.out.print("masukkan A : ");
            n1 = in.nextInt();
            System.out.print("masukkan B : ");
            n2 = in.nextInt();
            angka.pembagian(n1, n2);
            break;
            case 3 :
            System.out.print("masukkan A : ");
            n1 = in.nextInt();
            System.out.print("masukkan B : ");
            n2 = in.nextInt();
            angka.penjumlahan(n1, n2);
            break;
            case 4 :
            System.out.print("masukkan A : ");
            n1 = in.nextInt();
            System.out.print("masukkan B : ");
            n2 = in.nextInt();
            angka.pengurangan(n1, n2);
            break;
            case 5 :
            System.out.print("masukkan A : ");
            n1 = in.nextInt();
            System.out.print("masukkan B : ");
            n2 = in.nextInt();
            angka.sederhana(n1, n2);
            break;
        }
        }while (n  !=0);
        System.out.println("=> Terima kasih sudah mencoba !!! <=");
    }
}