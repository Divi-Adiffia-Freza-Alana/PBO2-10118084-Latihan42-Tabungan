/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan42.tabungan;




/**
 *
 * @author Freza
 */
public class Tabungan {
private int saldo;
private int jumlah;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    Tabungan(int saldo,int jumlah){
     
       
    }
    public int ambilUang (){
    
        return saldo - jumlah;
    }
}