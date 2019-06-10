package ar.edu.unahur.obj2;

public  class PresionaSinStock implements Estado {



    @Override
    public void servirGaseosa(int precioGaseosa, double dineroIngresado) {

    }

    @Override
    public void sinStock(double dineroIngresado,int stock) {

        System.out.print("Esta maquina se encuentra sin stock disponible: " +stock);

    }
}
