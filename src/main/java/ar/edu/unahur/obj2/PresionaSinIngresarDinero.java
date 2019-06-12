package ar.edu.unahur.obj2;

public class PresionaSinIngresarDinero implements Estado {


    @Override
    public void ejecutarAccion(int precioGaseosa, double dineroIngresado,int stock, boolean precionaPalanca) {


            if (precionaPalanca==true){
            System.out.print("Ingrese el dinero, el valor de la gaseosa es: $" + precioGaseosa);
        }

    }


}

