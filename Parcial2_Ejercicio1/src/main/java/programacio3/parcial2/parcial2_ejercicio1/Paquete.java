package programacio3.parcial2.parcial2_ejercicio1;

public class Paquete {
    private String codigo;
    private float peso;

    public Paquete(String codigo, float peso) {
        this.codigo = codigo;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
