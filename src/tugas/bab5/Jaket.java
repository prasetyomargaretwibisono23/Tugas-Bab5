package bab5;

import java.util.Scanner;

public class Jaket {
    public final int jaket1 = 100000;
    public final int jaket2 = 120000;
    public final int jaket3 = 175000;
    int hasil;
    public int jumlah;
    public void hargajaket1(int jumlah){
    if(jumlah > 100){
        hasil = jumlah * 95000;
        System.out.println("Harga yang harus di bayar = "+hasil);
    }
    else{
        hasil=jaket1*jumlah;
        System.out.println("Harga yang harus di bayar = "+hasil);
    }
    }
    public void hargajaket2(int jumlah){
    if(jumlah > 100){
        hasil = jumlah *120000;
        System.out.println("Harga yang harus di bayar = "+hasil);
    }
    else{
        hasil=jaket2*jumlah;
        System.out.println("Harga yang harus di bayar = "+hasil);
    }
    }
    public void hargajaket3(int jumlah){
    if(jumlah > 100){
        hasil = jumlah * 160000;
        System.out.println("Harga yang harus di bayar = "+hasil);
    }
    else{
        hasil=jaket3*jumlah;
        System.out.println("Harga yang harus di bayar = "+hasil);
    }
    }
}
