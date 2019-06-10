package ar.edu.unahur.obj2;

public class PresionaSinIngresarDinero implements Estado {


    @Override
    public void servirGaseosa(int precioGaseosa, double dineroIngresado) {

        if (dineroIngresado == 0) {
            System.out.print("Ingrese el dinero, el valor de la gaseosa es: " + precioGaseosa);
        }

    }

    @Override
    public void sinStock(double dineroIngresado,int stock) {

    }


}

