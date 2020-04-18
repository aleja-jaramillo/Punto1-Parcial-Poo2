package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Excepcion {
        Scanner Sc = new Scanner(System.in);
        String opc;
        int opt;
        ArrayList<Cliente> clientes = new ArrayList<>();

        Inmueble in1 = new Inmueble("20000000", "Carrera 32 #48-06", "Vendida");
        Inmueble in2 = new Inmueble("300000000", "Calle 84 # 45-26", "Arrendada");
        Inmueble in3 = new Inmueble("50000000", "Carrera 84 #23-45", "Arrendada");
        Inmueble in4 = new Inmueble("500000000", "Carrera 103 #129d-22", "En espera");

        Cliente c1 = new Cliente("Lucas Arredondo", "2014", "Propietario", in1);
        Cliente c2 = new Cliente("Andres Betancur", "2015", "Inquilino", in2);
        Cliente c3 = new Cliente("Jesus Machado", "2016", "Inquilino", in3);
        Cliente c4 = new Cliente("Angelica Cifuentes", "2017", "Propietario", in4);

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);

        System.out.println("Digite la identificación");

        opc = Sc.next();

        if (!opc.matches("[\\d]*")) {
            throw new Excepcion();
        }
        opt = Integer.parseInt(opc);
    }
}



