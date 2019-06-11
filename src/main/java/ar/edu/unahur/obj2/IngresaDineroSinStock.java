package ar.edu.unahur.obj2;

public  class IngresaDineroSinStock implements Estado {



    @Override
    public void ejecutarAccion(int precioGaseosa, double dineroIngresado,int stock, boolean precionaPalanca) {
        stock=0;
        System.out.print("Esta maquina se encuentra sin stock, la maquina le devuelve su dinero: $" + dineroIngresado);
    }

}