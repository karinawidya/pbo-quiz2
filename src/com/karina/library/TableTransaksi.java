/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karina.library;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class TableTransaksi extends DefaultTableModel{
    
    //kolom String array yang berfungsi untuk menyimpan nama kolom
    private String[] columns;
    
    //konstruktor
    public TableTransaksi(){
        this.columns = new String[] {
            "Nama", "Harga", "Jumlah"
        };
    }
    
    public String[] getColumnName(){
        return this.columns;
    }
}
