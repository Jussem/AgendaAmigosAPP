package autonoma.AgendaAmigosAPP.models;

/**
 * Representa un amigo con nombre, teléfono y correo electrónico.
 * 
 * @author Juan José Morales A.
     * @version 1.0
 * @since 2025-03-23
 */
public class Amigo {
    
    /**
     * Nombre del amigo.
     */
    private String nombre;
    
    /**
     * Teléfono del amigo.
     */
    private String telefono;
    
    /**
     * Correo electrónico del amigo.
     */
    private String correoElectronico;

    /**
     * Constructor para crear un nuevo amigo.
     * 
     * @param nombre Nombre del amigo.
     * @param telefono Teléfono del amigo.
     * @param correoElectronico Correo electrónico del amigo.
     */
    public Amigo(String nombre, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    /**
     * Verifica si el correo electrónico es válido.
     * 
     * @param correoElectronico Correo electrónico a verificar.
     */
    public void verificarCorreo(String correoElectronico){
        // Implementación pendiente
    }
    
    /**
     * Obtiene el correo electrónico del amigo.
     * 
     * @return Correo electrónico del amigo.
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Obtiene el nombre del amigo.
     * 
     * @return Nombre del amigo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el teléfono del amigo.
     * 
     * @return Teléfono del amigo.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece un nuevo correo electrónico para el amigo.
     * 
     * @param correoElectronico Nuevo correo electrónico.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Establece un nuevo nombre para el amigo.
     * 
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece un nuevo teléfono para el amigo.
     * 
     * @param telefono Nuevo teléfono.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
