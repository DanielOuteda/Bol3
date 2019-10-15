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
public class Bol3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Boletin 3
        Consumo obxCoche1 = new Consumo();
        obxCoche1.setLitros(50f);
        obxCoche1.setpGas(1.57f);
        Consumo obxCoche2 = new Consumo(500f, 80f, 90f, 1.6f);
        float valor = obxCoche2.consumoMedio();
        System.out.println("El consumo medio es : "+ valor);
        obxCoche2.setLitros(85f);
        float variable = obxCoche2.getvMed();
        System.out.println("La velocidad media es : "+ variable);
        
        
        
        
        
    }
    
}
