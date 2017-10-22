package com.autospatool.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Client {

    private int id;
    private String name;
    private String lastName;
    private String direccion;
    private String Telefono;
    private int cantidadAutos;

    public Client(int id, String name, String direccion, String telefono, int cantidadAutos) {
        this.id = id;
        this.name = name;
        this.direccion = direccion;
        Telefono = telefono;
        this.cantidadAutos = cantidadAutos;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public Client setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Client setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getTelefono() {
        return Telefono;
    }

    public Client setTelefono(String telefono) {
        Telefono = telefono;
        return this;
    }

    public int getCantidadAutos() {
        return cantidadAutos;
    }

    public Client setCantidadAutos(int cantidadAutos) {
        this.cantidadAutos = cantidadAutos;
        return this;
    }

    public static Client from(ResultSet rs) {
        try {
            return new Client(
                    rs.getInt("IdCliente"),
                    rs.getString("Nombre"),
                    rs.getString("Direcion"),
                    rs.getString("Telefono"),
                    rs.getInt("Cantidad_de_autos"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
