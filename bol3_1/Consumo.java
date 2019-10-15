/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol3_1;

/**
 *
 * @author doutedasolla
 */
public class Consumo {
    // Parametros
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    public Consumo (float klm, float lit, float vel, float gas) {
        km = klm;
        litros = lit;
        vMed = vel;
        pGas = gas;
    }
    
    public Consumo () {
        
    }
    
    
    public float getTempo (){
        float tiempo = (km / vMed);
        return tiempo;
    }
    
    public float consumoMedio (){
        float consumomedio = litros / km * 100;
        return consumomedio;
    }
    
    public float consumoEuros (){
        float consumoeuros = pGas / km * 100;
        return consumoeuros;
    }
    
    public float getKm (){
        return km;
    }
    
    public void setKm (float klm){
        float km = klm;
    }
    
    public float getLitros (){
        return litros;
    }
    
    public void setLitros (float lit){
        float litros = lit;
    }
    
    public float getvMed (){
        return vMed;
    }
    
    public void setvMed (float vel){
        float vMed = vel;
    }
    
    public float getpGas (){
        return pGas;
    }
    
    public void setpGas (float gas){
        float pGas = gas;
    }
    
    public void Visualizar (){
        System.out.println("La velocidad media es"+ vMed);
    }
}