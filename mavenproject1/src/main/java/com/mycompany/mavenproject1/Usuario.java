/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sala4
 */
public abstract class  Usuario {
    private String email;
    private String nombres;
    private String apellido;
    private int CC;

    public Usuario(String email, String nombres, String apellido, int CC) {
        this.email = email;
        this.nombres = nombres;
        this.apellido = apellido;
        this.CC = CC;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the CC
     */
    public int getCC() {
        return CC;
    }

    /**
     * @param CC the CC to set
     */
    public void setCC(int CC) {
        this.CC = CC;
    }

    
}
