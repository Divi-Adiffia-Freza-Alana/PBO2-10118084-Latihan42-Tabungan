/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan42.tabungan;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menghitung saldo tabungan

 */
public class PBO210118084Latihan42Tabungan {
private static int saldoskrg;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Scanner = new Scanner(System.in);
    Tabungan tabungan = new Tabungan(1,1);
   
    System.out.print("Masukkan Saldo Awal :");
    tabungan.setSaldo(Scanner.nextInt());
    System.out.print("Jumlah uang yang diambil :");
    tabungan.setJumlah(Scanner.nextInt());
    saldoskrg = tabungan.ambilUang();
        System.out.println("Saldo sekarang :"+saldoskrg);
    }
    
}
