/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionTareas;

/**
 *
 * @author Hp
 */
public class Main {
    public static void main(String[] args) {
        TareaFactory actividad1;
        TareaFactory actividad2;
        
        System.out.println("Una Tarea Simple: ");
        actividad1 = new TareaSimpleFactory();
        actividad1.MuestraTarea();
         
        System.out.println();
        
        System.out.println("Una Tarea Compleja: ");
        actividad2 = new TareaComplejaFactory();
        actividad2.MuestraTarea();
        
        
    
    
    }
}
