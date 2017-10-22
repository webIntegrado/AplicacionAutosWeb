package model;

public class Bill {

    private int id;
    private String date;
    private Report report;

    public Bill(int id, String date, Report report) {
        this.id = id;
        this.date = date;
        this.report = report;
    }

    public Bill() {
    }

    public int getId() {
        return id;
    }

    public Bill setId(int id) {
        this.id = id;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Bill setDate(String date) {
        this.date = date;
        return this;
    }

    public Report getReport() {
        return report;
    }

    public Bill setReport(Report report) {
        this.report = report;
        return this;
    }
}
