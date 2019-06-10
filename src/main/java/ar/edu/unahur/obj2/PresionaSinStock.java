package ar.edu.unahur.obj2;

public  class PresionaSinStock implements Estado {



    @Override
    public void servirGaseosa(int precioGaseosa, double dineroIngresado,boolean precionaPalanca) {

    }

    @Override
    public void sinStock(double dineroIngresado,int stock,boolean precionaPalanca) {

        System.out.print("Esta maquina se encuentra sin stock disponible: " +stock);

    }
}
