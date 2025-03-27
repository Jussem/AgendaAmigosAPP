/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.AgendaAmigosAPP.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class Agenda {
    private List<Amigo> amigos;

    public Agenda() {
        this.amigos = new ArrayList<>();
    }
    
    public void agregarAmigo(Amigo amigo){
        for(Amigo a:amigos) {
            if (a.getCorreoElectronico().equals(amigo.getCorreoElectronico())) {
                System.out.println("Ya existe un amigo agregado con este correo electronico. ");
                return;
            }
        }
        amigos.add(amigo);
    }
    
    public Amigo buscarAmigo(String correo){
        for (Amigo a: amigos) {
            if (a.getCorreoElectronico().equalsIgnoreCase(correo)) {
                JOptionPane.showMessageDialog(null,"Amigo con nombre: "+a.getNombre()+" y telefono"+a.getTelefono()+ "Encontrado");
                return a;
            }
        }
        return null;
    }
    public void eliminarAmigo(String correo){
    boolean eliminado = amigos.removeIf(a -> a.getCorreoElectronico().equalsIgnoreCase(correo));
    if (!eliminado) {
        JOptionPane.showMessageDialog(null,"No se encontro un amigo con este correo");
    }
    else{
        JOptionPane.showMessageDialog(null,"Eliminado correctamente");
    }
}

    
    public List<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(List<Amigo> amigos) {
        this.amigos = amigos;
    }
    
}
