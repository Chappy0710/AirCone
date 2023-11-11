package ConexionSQLDB;

import ClasesPrincipales.Clientes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class ClientesDB {

    //Codigo para el listado en la base de datos
    public ArrayList<Clientes> ListCliente() {
        ArrayList<Clientes> cliente = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT CLIENTE_ID,USUARIO_ID,NOMBRE,APELLIDOS,CORREO,CASA_ID,NUMERO_TELEFONO,ESTADO" + "   FROM CLIENTE");
            while (rs.next()) {
                Clientes cl = new Clientes();
                cl.setCliente_id(rs.getInt("CLIENTE_ID"));
                cl.setUsuario(rs.getInt("USUARIO_ID"));
                cl.setNombre(rs.getString("NOMBRE"));
                cl.setApellidos(rs.getString("APELLIDOS"));
                cl.setCorreo(rs.getString("CORREO"));
                cl.setCasa_id(rs.getInt("CASA_ID"));
                cl.setNumero_telefono(rs.getInt("NUMERO_TELEFONO"));
                cl.setEstado(rs.getString("ESTADO"));
                cliente.add(cl);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado");
        }

        return cliente;
    }

}
