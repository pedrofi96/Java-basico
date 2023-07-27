/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste01;



public class CalculadoraDoida {
    
    private boolean calcularCerto (){
        return Math.random() > 0.5;
    }
    
    public double somaDoisValores(double a, double b){
        if(calcularCerto()){
            return a + b;
        }
        return a-b;
    }
    
    
    
}
