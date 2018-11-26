/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karina.library;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Transaksi {
    
    private String code;//variable code untuk transaksi code
    private ArrayList<Item> items = new ArrayList<>();//variable items untuk menyimpan list item
    private float total;//variable total untuk menyimpan total
    
    //konstruktor berparameter
    public Transaksi(String code, float total) {
        this.code = code;
        this.total = total;
    }
    
    
    
}
