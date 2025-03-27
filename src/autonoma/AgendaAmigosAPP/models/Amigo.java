/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.AgendaAmigosAPP.models;

/**
 *
 * @author juanb
 */
public class Amigo {
    private String nombre;
    private String telefono;
    private String correoElectronico;

    public Amigo(String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
