/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

/**
 * @Instituto Rumiñahui
 * @author Paola
 */
public class TipoMetodos {
    
    public static void metodoStatic1(){
        System.out.println("Este es un método estático");
    }
    
    public static void metodoStatic2(int p){
        System.out.println("El número ingresado es: " + p);
    }
    
    public static int metodoStatic3(int p){
        
        return p;
    }
    
    public void suma(int x, int y){
        System.out.println("La suma es: "+ (x+y));
    }

}
