/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author mikev_6wadxan
 */
public class Estudiante extends Persona{
    
    int codigoes;
    int nota;
    
    public Estudiante(String nombre,String apellido,int edad,int codigoes,int nota){
    super(nombre,apellido,edad);
    this.codigoes=codigoes;
    this.nota=nota;
    }
   
    @Override
     public void mostrardatos(){
    System.out.println("Nombre: "+nombre + "Apellido: "+apellido+ "Edad: "+edad+"Codigo Estudiante:  "+codigoes+ "NOta: "+nota);
    }
    
    
}
