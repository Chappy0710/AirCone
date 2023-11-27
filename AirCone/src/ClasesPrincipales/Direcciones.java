package ClasesPrincipales;

/**
 *
 * @author kenneth
 */
public class Direcciones {
    
    int casa_id;
    String provincia;
    String canton;
    String distrito;
    int codigo_postal;

    public Direcciones() {
    }

    public Direcciones(int casa_id, String provincia, String canton, String distrito, int codigo_postal) {
        this.casa_id = casa_id;
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.codigo_postal = codigo_postal;
    }

    public int getCasa_id() {
        return casa_id;
    }

    public void setCasa_id(int casa_id) {
        this.casa_id = casa_id;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
}
