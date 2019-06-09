package ar.edu.unahur.obj2;

public class PresionaSinIngresarDinero implements Estado {


    @Override
    public void servierGaseosa(int precio, double dineroIngresado) {

        if (dineroIngresado == 0) {
            System.out.print("Usted no ingreso el dinero, el valor de la gaseos es: " + precio);
        }

    }
}

