package org.Informacion;

public class Venta implements Comparable<Venta> {
    private String nombre;
    private double monto;

    public Venta(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public int compareTo(Venta otraVenta) {
        return Double.compare(this.monto, otraVenta.getMonto());
    }
}
