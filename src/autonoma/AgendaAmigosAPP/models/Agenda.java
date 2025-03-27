package autonoma.AgendaAmigosAPP.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que representa una agenda de amigos, permitiendo agregar, buscar y eliminar contactos.
 *
 * @author Juan José Morales A.
 * @version 20250327
 * @since 1.0
 */
public class Agenda {
    private List<Amigo> amigos;

    /**
     * Constructor de la clase Agenda. Inicializa la lista de amigos.
     */
    public Agenda() {
        this.amigos = new ArrayList<>();
    }
    
    /**
     * Agrega un nuevo amigo a la agenda.
     *
     * @param amigo El objeto Amigo a agregar.
     */
    public void agregarAmigo(Amigo amigo){
        for(Amigo a : amigos) {
            if (a.getCorreoElectronico().equals(amigo.getCorreoElectronico())) {
                JOptionPane.showMessageDialog(null,"Ya existe un amigo agregado con este correo electronico.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null,"Amigo agregado correctamente");
        amigos.add(amigo);
    }
    
    /**
     * Busca un amigo en la agenda por su correo electrónico.
     *
     * @param correo Correo electrónico del amigo a buscar.
     * @return El objeto Amigo si es encontrado, de lo contrario, null.
     */
    public Amigo buscarAmigo(String correo){
        for (Amigo a : amigos) {
            if (a.getCorreoElectronico().equalsIgnoreCase(correo)) {
                JOptionPane.showMessageDialog(null,"Amigo con nombre: " + a.getNombre() + " y telefono: " + a.getTelefono() + " encontrado");
                return a;
            }
            else JOptionPane.showMessageDialog(null,"no se ha encotrando ningun amigo el correo: "+correo);
        }
        return null;
    }
    
    /**
     * Elimina un amigo de la agenda por su correo electrónico.
     *
     * @param correo Correo electrónico del amigo a eliminar.
     */
    public void eliminarAmigo(String correo){
        boolean eliminado = amigos.removeIf(a -> a.getCorreoElectronico().equalsIgnoreCase(correo));
        if (!eliminado) {
            JOptionPane.showMessageDialog(null, "No se encontró un amigo con el correo");
        } else {
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
        }
    }

    /**
     * Obtiene la lista de amigos registrados en la agenda.
     *
     * @return Lista de amigos.
     */
    public List<Amigo> getAmigos() {
        return amigos;
    }

    /**
     * Establece la lista de amigos en la agenda.
     *
     * @param amigos Lista de amigos a asignar.
     */
    public void setAmigos(List<Amigo> amigos) {
        this.amigos = amigos;
    }
}
