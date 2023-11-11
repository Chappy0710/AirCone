package ClasesPrincipales;

public class Clientes {

    int cliente_id;
    int usuario;
    String nombre;
    String apellidos;
    String correo;
    int casa_id;
    int numero_telefono;
    String estado;

    public Clientes() {
    }

    public Clientes(int cliente_id, int usuario, String nombre, String apellidos, String correo, int casa_id, int numero_telefono, String estado) {
        this.cliente_id = cliente_id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.casa_id = casa_id;
        this.numero_telefono = numero_telefono;
        this.estado = estado;

    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCasa_id() {
        return casa_id;
    }

    public void setCasa_id(int casa_id) {
        this.casa_id = casa_id;
    }

    public int getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(int numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
