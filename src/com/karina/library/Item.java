/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karina.library;

/**
 *
 * @author ASUS
 */
public class Item {
    private String nama;//variable nama untuk nama item
    private float harga;//variable harga untuk harga dari item
    private int jumlah;//variable jumlah untuk jumlah dari item
    
    //membuat konstruktor default
    public Item() {
    }
    
    //membuat konstruktor berparameter nama, harga, dan jumlah
    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    //Getter nama
    public String getNama() {
        return nama;
    }
    //Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //Getter harga
    public float getHarga() {
        return harga;
    }
    //Setter harga
    public void setHarga(float harga) {
        this.harga = harga;
    }
    //Getter Jumlah
    public int getJumlah() {
        return jumlah;
    }
    //Setter jumlah
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //menghitung hasil dari item dan jumlah
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    
    public String toString(){
        return this.nama;
    }
    
}
