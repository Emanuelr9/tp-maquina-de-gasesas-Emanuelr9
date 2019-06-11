package ar.edu.unahur.obj2;

public  class PresionaSinStock implements Estado {



    @Override
    public void ejecutarAccion(int precioGaseosa, double dineroIngresado,int stock, boolean precionaPalanca) {

        if (precionaPalanca==true)
            System.out.print("Esta maquina se encuentra sin stock disponible" );
    }

}
