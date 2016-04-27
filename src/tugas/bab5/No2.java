package bab5;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Jaket jak = new Jaket();
        int pilih;
        do{
        Scanner in = new Scanner(System.in);
        System.out.println("Menu Jaket");
        System.out.println("Type Jaket         Harga  ");
        System.out.println("1.Jaket kain    Rp 100.000");
        System.out.println("2.Jaket Jeans   Rp 120.000");
        System.out.println("3.Jaket Kulit   Rp 175.000");
        System.out.println("4.keluar");
        System.out.print("Masukkan pilihan anda = ");
        pilih = in.nextInt();
        switch(pilih){
            case 1 : System.out.println("Masukkan jumlah jaket yang dibeli =");
                pilih = in.nextInt();    
                jak.hargajaket1(pilih);break;
            case 2 : System.out.println("Masukkan jumlah jaket yang dibeli =");
                pilih = in.nextInt();
                jak.hargajaket2(pilih);break;
            case 3 : System.out.println("Masukkan jumlah jaket yang dibeli =");
                pilih = in.nextInt();
                jak.hargajaket3(pilih);break;
        }
        }while (pilih   !=4);
        System.out.println("=> terima kasih sudah membeli !!! <=");
    }
}