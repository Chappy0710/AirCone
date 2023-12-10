package ClasesPrincipales;

/**
 *
 * @author kenneth
 */
public class Usuarios {
    
    int usuario_id;
    String nombre_usuario;
    String contraseña;

    public Usuarios() {
    }

    public Usuarios(int usuario_id, String nombre_usuario, String contraseña) {
        this.usuario_id = usuario_id;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
