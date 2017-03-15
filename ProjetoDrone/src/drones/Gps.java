/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drones;

/**
 *
 * @author Turnes
 */
public class Gps {

    private double latitudeInicial;

    private double latitudeAtual;

    private double longitudeAtual;

    private double longitudeInicial;
    
    private double altitude;
    
    public Gps(double latitude, double longitude){
        longitudeAtual = longitudeInicial = longitude;
        latitudeAtual = latitudeInicial = latitude;
    }
    
    public void setLatInic(double l){
        latitudeInicial = l;
    }
    
    public void setLatAtual(double l){
        latitudeAtual = l;
    }
    
    public void setLongInic(double l){
        longitudeInicial = l;
    }
    
    public void setLongAtual(double l){
        longitudeAtual = l;
    }
    
    public double getLatInic(){
        return latitudeInicial;
    }
    
    public double getLongInic(){
        return longitudeInicial;
    }
    
    public double getLatAtual(){
        return latitudeAtual;
    }
    
    public double getLongAtual(){
        return longitudeAtual;
    }
    
    public double getAltitude(){
        return altitude;
    }
    
    public void setAltitude(int a){
        altitude = a;
    }
    
    public void voltaOrigem(){
        longitudeAtual = longitudeInicial;
        latitudeAtual = latitudeInicial;
    }

}
