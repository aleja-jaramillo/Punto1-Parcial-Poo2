package Ejercicio1;

public class Cliente {

    private String nombre;
    private String identificacion;
    private String tipoPersona;

    public Cliente(String nombre, String identificacion, String tipoPersona, Inmueble apartamento ) {
       this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}
