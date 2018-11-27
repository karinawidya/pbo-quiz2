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
    
    private final String code;//variable code untuk transaksi code
    private ArrayList<Item> items = new ArrayList<>();//variable items untuk menyimpan list item
    private float total;//variable total untuk menyimpan total
    
    //konstruktor berparameter
    public Transaksi(String code, ArrayList<Item> items) {
        this.code = code;
        this.items = items;
    }
    
    //Setter total
    public void setTotal() {
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    //output transaksi
    public String printDetail(){
        setTotal();
        String string = "";
        string += "Kode\t\t: "+ this.code +"\n";
        string += "Daftar belanja : \n";
        for(Item item : this.items){
            string += "\t" + item.getNama() + "(x" + item.getJumlah() +") : "+ item.getTotal() + "\n"; 
        }
        string += "Total\t\t: "+ this.total;
        return string;
    } 
}
