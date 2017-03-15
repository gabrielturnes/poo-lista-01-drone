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
public class Rotor {
    private int velocidade;
    
    public Rotor(){}
    
    public void setVelocidade(int v){
        velocidade = v;
    }
    
    public void mudaVelocidade(int v){
        velocidade = velocidade + v;
    }
}
