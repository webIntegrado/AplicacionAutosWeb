package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientEntity extends BaseEntity {

    public ClientEntity (Connection connection, String tableName){
        super(connection,tableName);
    }

    public ClientEntity(){
        super();
        setTableName("cliente");
    }

    public Client findById(int id) {

        return findByCriteria(
                String.format("WHERE IdCliente = %d", id)).get(0);
    }


    public List<Client> findByCriteria(String criteria) {
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Client> regions = new ArrayList<>();
            while(rs.next())
                regions.add(Client.from(rs));

            return regions;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
    public Client findByName(String name) {
        return findByCriteria(
                String.format("WHERE Nombre = '%s'", name)).get(0);
    }

    public List<Client> findAll() {
        return findByCriteria("");
    }

    public Client create(Client client) {
        return executeUpdate(String.format(
                "INSERT INTO %s(IdCliente, Nombre, Direccion, Telefono, Cantidad_de_autos) VALUES(%d, '%s', '%s', '%s', %d)",
                getTableName(), client.getId(), client.getName(),client.getDireccion(),client.getTelefono(),client.getCantidadAutos())) ?
                client : null;
    }

    private int getMaxId() {
        String sql = "SELECT MAX(IdCliente) AS max_id FROM cliente";
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            return resultSet.next() ?
                    resultSet.getInt("max_id") : 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public Client create(String name,String direccion, String telefono, int cantidadAutos) {
        return create(getMaxId()+1, name,direccion,telefono,cantidadAutos);
    }

    public Client create(int id, String name,String direccion, String telefono, int cantidadAutos) {
        return create(new Client(id, name,direccion,telefono,cantidadAutos));
    }

    public boolean update(int id, String name) {
        return executeUpdate(String.format(
                "UPDATE %s SET Nombre = '%s' WHERE IdCliente = %d", getTableName(), name, id));
    }

    public boolean update(Client client) {
        return update(client.getId(), client.getName());
    }

    public boolean erase(int id) {
        return executeUpdate(String.format("DELETE FROM %s WHERE IdCliente = %d",
                getTableName(), id));
    }

    public boolean erase(Client client) {
        return executeUpdate(String.format("DELETE FROM %s WHERE region_id = %d",
                getTableName(), client.getId()));
    }
}
