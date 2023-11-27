package ClasesPrincipales;

/**
 *
 * @author kenneth
 */
public class Ordenes {
    
    int orden_id;
    int total_ordenes;
    String metodo_pago;
    int envio_id;
    int cliente_id;
    int producto_id;
    int sucursal_id;

    public Ordenes() {
    }

    public Ordenes(int orden_id, int total_ordenes, String metodo_pago, int envio_id, int cliente_id, int producto_id, int sucursal_id) {
        this.orden_id = orden_id;
        this.total_ordenes = total_ordenes;
        this.metodo_pago = metodo_pago;
        this.envio_id = envio_id;
        this.cliente_id = cliente_id;
        this.producto_id = producto_id;
        this.sucursal_id = sucursal_id;
    }

    public int getOrden_id() {
        return orden_id;
    }

    public void setOrden_id(int orden_id) {
        this.orden_id = orden_id;
    }

    public int getTotal_ordenes() {
        return total_ordenes;
    }

    public void setTotal_ordenes(int total_ordenes) {
        this.total_ordenes = total_ordenes;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public int getEnvio_id() {
        return envio_id;
    }

    public void setEnvio_id(int envio_id) {
        this.envio_id = envio_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public int getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(int sucursal_id) {
        this.sucursal_id = sucursal_id;
    }
        
}
