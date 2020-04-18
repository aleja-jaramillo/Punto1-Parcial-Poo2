package Ejercicio1;

public class ClassExcepcion1  extends Exception{
    private String Message;

    public ClassExcepcion1(String message){
        Message = message;
    }

    public String Excepcion(){
        return "ERROR";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
