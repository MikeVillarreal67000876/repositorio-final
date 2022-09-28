/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sala4
 */
public class Profesor extends Usuario {
private String  CorreoInstitucional;
 private String especialidad;

    public Profesor(String especialidad, String email, String nombres, String apellido, int CC) {
        super(email, nombres, apellido, CC);
        this.especialidad = especialidad;
    }
 public String CorreoInstitucional (){
    return "";
}    
}
