package aplikasi.pom.bensin;

import java.util.Scanner;

/**
 *
 * @author sugiyono
 */
public class AplikasiPomBensin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner usr = new Scanner(System.in);
        Scanner pas = new Scanner(System.in);
        
        System.out.println("SILAHKAN LOGIN");
        System.out.print("Username : ");
        String user=usr.next();
        System.out.print("Password : ");
        String pass=pas.next();
        
        if(user.equalsIgnoreCase("sugiyono") && pass.equalsIgnoreCase("eresha")){
            System.out.println("Login Admin Berhasil");
            }else{
            System.out.println("Maaf Login Gagal");
            System.exit(0);
        }
        System.out.println("#################################################");
        System.out.println("-------Program Penjualan Bahan Bakar Minyak-------");
        System.out.println("1.Uang");
        System.out.println("2.Bensin");
        System.out.print("Pilih Takaran Menurut (No.1 atau No.2): ");
        
         Scanner input = new Scanner(System.in);
         
    int menu = input.nextInt();
    float liter,uang,bensin,total;
    
    switch(menu) {
    case 1:
    System.out.print("Masukan Jumlah Uang Dalam Rupiah : ");
    uang=input.nextFloat();
    bensin=7600;
    liter=uang/bensin;
    total=0;
     while (total==liter || ! (total>=liter)){
    total=(float) (total+0.0001);
    System.out.println("Bensin = "+total);}
    System.out.println("Total Bensin Yang Dikeluarkan = "+String.format("%.2f",total)+" Liter");
    break;
    case 2:
    System.out.print("Masukan Jumlah Bensin Dalam Liter : ");
    bensin=input.nextFloat();
    liter=7600;
    uang=liter*bensin;
    total=0;
     while (total==uang || ! (total>=uang)){
    total=(total+10);
    System.out.println("Uang = "+uang);}
    System.out.println("Total Uang Yang Harus Anda Bayar = "+total+" Rupiah");
    break;
    default :
    System.out.println ("maaf pilhan yang anda masukan salah");
}}}