package ClasesPrincipales;

public class Productos {

    int producto_id;
    String nombre_producto;
    int cantidad_vendida;
    float precio_producto;
    int mantenimiento_anual;
    int mantenimiento_trimestral;
    int sucursal_id;

    public Productos() {
    }

    public Productos(int producto_id, String nombre_producto, int cantidad_vendida, float precio_producto, int mantenimiento_anual, int mantenimiento_trimestral, int sucursal_id) {
        this.producto_id = producto_id;
        this.nombre_producto = nombre_producto;
        this.cantidad_vendida = cantidad_vendida;
        this.precio_producto = precio_producto;
        this.mantenimiento_anual = mantenimiento_anual;
        this.mantenimiento_trimestral = mantenimiento_trimestral;
        this.sucursal_id = sucursal_id;

    }

    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad_vendida() {
        return cantidad_vendida;
    }

    public void setCantidad_vendida(int cantidad_vendida) {
        this.cantidad_vendida = cantidad_vendida;
    }

    public float getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(float precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getMantenimiento_anual() {
        return mantenimiento_anual;
    }

    public void setMantenimiento_anual(int mantenimiento_anual) {
        this.mantenimiento_anual = mantenimiento_anual;
    }

    public int getMantenimiento_trimestral() {
        return mantenimiento_trimestral;
    }

    public void setMantenimiento_trimestral(int mantenimiento_trimestral) {
        this.mantenimiento_trimestral = mantenimiento_trimestral;
    }

    public int getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(int sucursal_id) {
        this.sucursal_id = sucursal_id;
    }
}
