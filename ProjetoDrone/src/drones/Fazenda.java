/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drones;
import java.util.ArrayList;
/**
 *
 * @author Turnes
 */
public class Fazenda {
    
    private ArrayList<Drone> drones = new ArrayList<>();

    private int quantidadeDrones;
    
    private int quantidadeDronesNoAr;
    
    public Fazenda(){
        quantidadeDronesNoAr = 0;
        quantidadeDrones = 0;
    }
    
    public void insereDrone(Drone d){
        drones.add(d);
        quantidadeDrones++;
    }
    
    public int getDronesNoAr() {
        return quantidadeDronesNoAr;
    }
    
    public void addDroneNoAr() {
        quantidadeDronesNoAr++;
    }
    
    public void delDroneNoAr() {
        quantidadeDronesNoAr--;
    }
}
