/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET1
 */
import java.util.Scanner;
public class Void {
    String nama;
    String alamat;
    String merk;
    String tipe;
    String model;
    String warna;
    
    int pkb;
    int swdkllj;
    int pnpbStnk;
    int pnpbTnkb;
    
    void data(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pengisian Data");
        
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan Merk : ");
        merk = input.nextLine();
        System.out.print("Masukkan Tipe : ");
        tipe = input.nextLine();
        System.out.print("Masukkan Model : ");
        model = input.nextLine();
        System.out.print("Masukkan Warna : ");
        warna = input.nextLine();
        System.out.println("------------------------");
    }
    
    void pajak(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pengisian Pajak");
        
        System.out.print("Masukkan PKB : ");
        pkb = input.nextInt();
        System.out.print("Masukkan SWDKLLJ : ");
        swdkllj = input.nextInt();
        System.out.print("Masukkan PNPB STNK : ");
        pnpbStnk = input.nextInt();
        System.out.print("Masukkan PNPB TNKB : ");
        pnpbTnkb = input.nextInt();
        System.out.println("=======================");
    }
    
    void tampil(){
        System.out.println("Nama    : " +nama);
        System.out.println("Alamat  : " +alamat);
        System.out.println("Merk    : " +merk);
        System.out.println("Tipe    : " +tipe);
        System.out.println("Model   : " +model);
        System.out.println("Warna   : " + warna);
        System.out.println("---------------------");
        System.out.println("PKB         : " +pkb);
        System.out.println("SWDKLLJ     : " +swdkllj);
        System.out.println("PKB         : " +pnpbStnk);
        System.out.println("SWDKLLJ     : " +pnpbTnkb);
        System.out.println("JUMLAH PAJAK: " +(pkb + swdkllj + pnpbStnk + pnpbTnkb));
    }
        
}

