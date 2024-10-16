package programacio3.parcial2.parcial2_ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Envio {
    private String codigo;
    private LocalDate fechaEnvio;
    private Zona zona;
    private int total;
    private String cliente;
    private ArrayList<Paquete> paquetes;

    public Envio(String codigo, LocalDate fechaEnvio, Zona zona, int total, String cliente, ArrayList<Paquete> paquetes) {
        this.codigo = codigo;
        this.fechaEnvio = fechaEnvio;
        this.zona = zona;
        this.total = total;
        this.cliente = cliente;
        this.paquetes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }



}
