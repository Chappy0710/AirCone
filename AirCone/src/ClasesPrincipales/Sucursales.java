package ClasesPrincipales;

/**
 *
 * @author kenneth
 */
public class Sucursales {
    
    int sucursal_id;
    int telefono;
    String horario;
    String correo_contacto;

    public Sucursales() {
    }

    public Sucursales(int sucursal_id, int telefono, String horario, String correo_contacto) {
        this.sucursal_id = sucursal_id;
        this.telefono = telefono;
        this.horario = horario;
        this.correo_contacto = correo_contacto;
    }

    public int getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(int sucursal_id) {
        this.sucursal_id = sucursal_id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCorreo_contacto() {
        return correo_contacto;
    }

    public void setCorreo_contacto(String correo_contacto) {
        this.correo_contacto = correo_contacto;
    }
       
}
