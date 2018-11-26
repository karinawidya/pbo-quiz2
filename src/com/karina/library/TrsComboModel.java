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
public class TrsComboModel {
    private HashMap<String, Float> items = new HashMap();
    
    //konstruktor untuk TrsComboModel
    public TrsComboModel() {
        this.items.put("Gula", new Float(30000));
        this.items.put("Kopi", new Float(10000));
        this.items.put("Susu", new Float(2000));
    }

    
    
    
}
