package model;

public class Report {
    private int id;
    private String concepto;
    private int cantidad;
    private int reparacion;
    private Mechanic mechanic;

    public Report(int id, String concepto, int cantidad, int reparacion, Mechanic mechanic) {
        this.id = id;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.reparacion = reparacion;
        this.mechanic = mechanic;
    }

    public Report() {
    }

    public int getId() {
        return id;
    }

    public Report setId(int id) {
        this.id = id;
        return this;
    }

    public String getConcepto() {
        return concepto;
    }

    public Report setConcepto(String concepto) {
        this.concepto = concepto;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Report setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public int getReparacion() {
        return reparacion;
    }

    public Report setReparacion(int reparacion) {
        this.reparacion = reparacion;
        return this;
    }

    public Mechanic getMechanic() {
        return mechanic;
    }

    public Report setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
        return this;
    }
}
