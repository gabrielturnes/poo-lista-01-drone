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
public class Drone {

    private int cameras;

    private double autonomia;

    private Fazenda local;

    private Gps coordenadas;

    private Rotor[][] rotores;

    public Drone(int qntdCameras, double latitude, double longitude, Fazenda l, int r) {
        cameras = qntdCameras;
        local = l;
        if (qntdCameras != 1 && qntdCameras != 2) {
            System.out.println("Número de câmeras incorreto!");
        }
        coordenadas = new Gps(latitude, longitude);
        coordenadas.setAltitude(0);
        for(int i = 0; i<r/2; i++){
            rotores = new Rotor[r/2][2];            
        }
        
        l.insereDrone(this);
    }

    public void decolar() {
        if (coordenadas.getAltitude() == 0) {
            coordenadas.setAltitude(5);
            local.addDroneNoAr();
        } else {
            System.out.println("Esse drone já esta no ar!");
        }
    }

    public void aterrisar() {
        if (coordenadas.getAltitude() > 0) {
            coordenadas.setAltitude(0);
            local.delDroneNoAr();
            
        } else {
            System.out.println("Esse drone não esta no ar!");
        }
    }

    public void aterrisarOrigem() {
        if (coordenadas.getAltitude() > 0) {
            coordenadas.setAltitude(0);
            local.delDroneNoAr();
            coordenadas.voltaOrigem();
        } else {
            System.out.println("Esse drone não esta no ar!");
        }
    }

    public int getNoAr() {
        int noAr;
        if(coordenadas.getAltitude() > 0){
            noAr = 1;
        }else{
            noAr = 0;
        }
        return noAr;
    }
    
    public Gps setCoordenadas(){
        return coordenadas;
    }

    public void aumentarAltitude(){
    }
}
