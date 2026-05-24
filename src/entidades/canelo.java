/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author sthef
 */
public class canelo {
    private String nombre;
    public canelo(){
        this.nombre="canelo";
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String ladrar(){
        return "canelo dice guau";
    }
}
