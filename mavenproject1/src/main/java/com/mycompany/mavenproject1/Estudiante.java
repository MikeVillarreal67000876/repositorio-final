/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sala4
 */
public class Estudiante extends Usuario {
private int codigo;
private String correoinstitucional;
private String correoinstitucional1CAMBIO1;
    public Estudiante(int codigo, String correoinstitucional, String email, String nombres, String apellido, int CC) {
        super(email, nombres, apellido, CC);
        this.codigo = codigo;
        this.correoinstitucional = CreadorCorreoInstitucional ();
    }
    public String CreadorCorreoInstitucional(){
        return "";
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCorreoinstitucional() {
        return correoinstitucional;
    }

    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }

    
}
