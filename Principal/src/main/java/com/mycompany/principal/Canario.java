/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import com.cibancode.patterndesign.lab3.interfaces.volar;
public abstract class Canario extends ave implements volar {
    
    @Override
    
    public void makeSound(){
    
    
    System.out.println("canta");
    }
    
    @Override
    public void vuela(){
    System.out.println("Vuela con alas");
    }
    
    
}
