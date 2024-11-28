/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionTareas;

/**
 *
 * @author Hp
 */
public abstract class TareaFactory {
    public abstract Tarea CreateTarea();
    
    public void MuestraTarea(){
        Tarea actividad = CreateTarea();
        actividad.escribir();
        
    }
}
