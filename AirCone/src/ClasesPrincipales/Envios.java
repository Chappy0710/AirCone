package ClasesPrincipales;

/**
 *
 * @author kenneth
 */
public class Envios {
    
    int envio_id;
    String tipo;
    String estado;

    public Envios() {
    }

    public Envios(int envio_id, String tipo, String estado) {
        this.envio_id = envio_id;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getEnvio_id() {
        return envio_id;
    }

    public void setEnvio_id(int envio_id) {
        this.envio_id = envio_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
       
}
