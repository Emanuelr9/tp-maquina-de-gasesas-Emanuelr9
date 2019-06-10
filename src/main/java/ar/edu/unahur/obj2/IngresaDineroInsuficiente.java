package ar.edu.unahur.obj2;

public  class IngresaDineroInsuficiente implements Estado {

    @Override
    public void servirGaseosa(int precioGaseosa, double dineroIngresado){

        int faltante;
        faltante = (int) (precioGaseosa - dineroIngresado);

        System.out.print("El dinero es insuficiente, restan poner:" + faltante );


    }

    @Override
    public void sinStock(double dineroIngresado,int stock) {

    }
}
