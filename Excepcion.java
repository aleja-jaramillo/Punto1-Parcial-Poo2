package Ejercicio1;

public class Excepcion extends Exception {

    public Excepcion(){

    }

    @Override
    public String getMessage() {
        String error = "";
        error = "La identificación no es numerica";
        return error;
    }

}
