package Ejercicio1;

public class Inmueble {

    private String valor;
    private String direccion;
    private String estInmueble;

    public Inmueble(String valor, String direccion, String estInmueble){
        this.direccion = direccion;
        this.valor = valor;
        this.estInmueble = estInmueble;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstInmueble() {
        return estInmueble;
    }

    public void setEstInmueble(String estInmueble) {
        this.estInmueble = estInmueble;
    }
}
