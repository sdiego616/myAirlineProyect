/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author User
 */
public class Avion {
    private String codigoAvion;
    private double pesoMax;
    private int pasajerosMax;
    private double velocidad;
    private boolean disponible;

    public Avion(String codigoAvion, double pesoMax, int pasajerosMax, double velocidad, boolean disponible) {
        this.codigoAvion = codigoAvion;
        this.pesoMax = pesoMax;
        this.pasajerosMax = pasajerosMax;
        this.velocidad = velocidad;
        this.disponible = disponible;
    }
}
