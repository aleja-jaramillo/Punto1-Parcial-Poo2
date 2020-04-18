package Ejercicio1;

public class ClassExcepcion extends Exception {

    public ClassExcepcion(){
    }

    @Override
    public String getMessage(){

        String error = "";

        error = "El valor ingresado no es numerico";
        return error;
    }
}
