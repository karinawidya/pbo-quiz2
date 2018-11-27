/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karina.library;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class ComboTransaksi {
    private HashMap<String, Float> items = new HashMap<>();
    
    //konstruktor
    public ComboTransaksi(){
        this.items.put("Gula", new Float(30000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(20000));
    }
    
    //menambahkan method ArrayList untuk menambah item berdasarkan nama item
    public ArrayList<String> getNama(){
        ArrayList<String> string = new ArrayList<>();
        for(String item : this.items.keySet()){
            string.add(item);
        }
        return string;
    }
    
    //menambahkan mthod ArrayList untuk menambahkan harga pada item
    public ArrayList<Float> getHarga(){
        ArrayList<Float> flt = new ArrayList<>();
        for(float item : this.items.values()){
            flt.add(item);
        }
        return flt;
    }
}
