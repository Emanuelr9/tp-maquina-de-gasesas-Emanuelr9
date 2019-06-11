package ar.edu.unahur.obj2;

public  class IngresaDineroInsuficiente implements Estado {



    @Override
    public void ejecutarAccion(int precioGaseosa, double dineroIngresado,int stock, boolean precionaPalanca){

        int faltante;
        faltante = (int) (precioGaseosa - dineroIngresado);

        System.out.print("El dinero es insuficiente, restan poner: $" + faltante );

    }

}
