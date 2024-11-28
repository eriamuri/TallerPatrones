/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionTareas;

/**
 *
 * @author Hp
 */
public class TareaSimpleFactory extends TareaFactory{

    @Override
    public Tarea CreateTarea() {
        return new TareaSimple();
    }
    
}
