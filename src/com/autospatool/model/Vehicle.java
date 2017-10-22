package com.autospatool.model;

public class Vehicle {

    private int id;
    private String modelo;
    private String color;
    private String Fecha;
    private String tipo;
    private Client client;

    public Vehicle(int id, String modelo, String color, String fecha, String tipo, Client client) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
        Fecha = fecha;
        this.tipo = tipo;
        this.client = client;
    }

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public Vehicle setId(int id) {
        this.id = id;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Vehicle setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(String color) {
        this.color = color;
        return this;
    }

    public String getFecha() {
        return Fecha;
    }

    public Vehicle setFecha(String fecha) {
        Fecha = fecha;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Vehicle setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Vehicle setClient(Client client) {
        this.client = client;
        return this;
    }
}
