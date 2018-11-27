/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karina.library;

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
    
    
}
