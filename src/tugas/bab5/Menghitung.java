package bab5;
public class Menghitung {
    private int perkalian;
    private int pembagian;
    private int sederhana;
    private static int penjumlahan;
    private static int pengurangan;
    public int hasil;
    
    public void pekalian(int n1,int n2 ){
    hasil= n1 * n2;
    System.out.println("Hasil perkalian A * B adalah "+hasil);
    }
    public void pembagian(int n1,int n2){
    hasil= n1 * n2;
    System.out.println("Hasil pembagian A / B adalah "+hasil);
    }
    public void penjumlahan(int n1,int n2){
    hasil+= n1 * n2;
    System.out.println("Hasil penjumlahan A + B adalah "+hasil);
    }
    public void pengurangan(int n1,int n2){
    hasil+= n1 * n2;
    System.out.println("Hasil pengurangan A - B adalah "+hasil);
    }
    public void sederhana(int n1,int n2){
    System.out.println("Hasil pemangkatan A ^ B adalah "+Math.pow(n1,n2));
    }
}
