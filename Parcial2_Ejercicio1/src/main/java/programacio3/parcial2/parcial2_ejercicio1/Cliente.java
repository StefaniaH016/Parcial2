package programacio3.parcial2.parcial2_ejercicio1;

import java.util.ArrayList;

public class Cliente {

    private TipoIdentificacion tipoIdentificacion;
    private String id;
    private String nombres;
    private String apellidos;
    private String telefono;

    public Cliente(TipoIdentificacion tipoIdentificacion, String id, String nombres, String apellidos, String telefono) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
