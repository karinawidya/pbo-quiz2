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
    
    
}
