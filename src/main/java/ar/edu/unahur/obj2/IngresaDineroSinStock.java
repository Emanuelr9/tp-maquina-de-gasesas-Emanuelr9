package ar.edu.unahur.obj2;

public  class IngresaDineroSinStock implements Estado {



    @Override
    public void sinStock(double dineroIngresado,int stock,boolean precionaPalanca) {
        System.out.print("Esta maquina se encunetra sin stock" + dineroIngresado);
    }

    @Override
    public void servirGaseosa(int precioGaseosa, double dineroIngresado,boolean precionaPalanca) {

    }

}