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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fazenda santoAmaro = new Fazenda();
        Drone drone1 = new Drone(2, 100, 200, santoAmaro, 4);
        Drone drone2 = new Drone(1, 500, 250, santoAmaro, 4);
        drone1.decolar();
        Gps coordenadas1 = drone1.setCoordenadas();
        coordenadas1.setLongAtual(1);
        drone1.aterrisarOrigem();
        System.out.println("Lat inicial: " + coordenadas1.getLatInic());
        System.out.println("Long inicial: " + coordenadas1.getLongInic());
        System.out.println("Lat atual: " + coordenadas1.getLatAtual());
        System.out.println("Long atual: " + coordenadas1.getLongAtual());
        drone2.decolar();
//        System.out.println(drone1.getNoAr());
        System.out.println("Santo Amaro possui " + santoAmaro.getDronesNoAr() + " drones no ar.");
    }
    
}
