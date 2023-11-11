package ConexionSQLDB;

import ClasesPrincipales.Productos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class ProductosDB {

    //Codigo para el listado en la base de datos
    public ArrayList<Productos> ListProducto() {
        ArrayList<Productos> producto = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT PRODUCTO_ID,NOMBRE_PRODUCTO,CANTIDAD_VENDIDA,PRECIO_PRODUCTO,MANTENIMIENTO_ANUAL,MANTENIMIENTO_TRIMESTRAL,SUCURSAL_ID" + "   FROM INVENTARIO_PRODUCTO");
            while (rs.next()) {
                Productos pr = new Productos();
                pr.setProducto_id(rs.getInt("PRODUCTO_ID"));
                pr.setNombre_producto(rs.getString("NOMBRE_PRODUCTO"));
                pr.setCantidad_vendida(rs.getInt("CANTIDAD_VENDIDA"));
                pr.setPrecio_producto(rs.getFloat("PRECIO_PRODUCTO"));
                pr.setMantenimiento_anual(rs.getInt("MANTENIMIENTO_ANUAL"));
                pr.setMantenimiento_trimestral(rs.getInt("MANTENIMIENTO_TRIMESTRAL"));
                pr.setSucursal_id(rs.getInt("SUCURSAL_ID"));
                producto.add(pr);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado");
        }

        return producto;
    }

}
