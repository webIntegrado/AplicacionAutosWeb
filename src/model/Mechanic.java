package model;

public class Mechanic {

    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private Double costoHora;
    private String Categoria;
    private Vehicle vehicle;

    public Mechanic(int id, String nombre, String direccion, String telefono, Double costoHora, String categoria, Vehicle vehicle) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.costoHora = costoHora;
        Categoria = categoria;
        this.vehicle = vehicle;
    }

    public Mechanic() {
    }

    public int getId() {
        return id;
    }

    public Mechanic setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Mechanic setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Mechanic setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public String getTelefono() {
        return telefono;
    }

    public Mechanic setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public Double getCostoHora() {
        return costoHora;
    }

    public Mechanic setCostoHora(Double costoHora) {
        this.costoHora = costoHora;
        return this;
    }

    public String getCategoria() {
        return Categoria;
    }

    public Mechanic setCategoria(String categoria) {
        Categoria = categoria;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Mechanic setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }
}
