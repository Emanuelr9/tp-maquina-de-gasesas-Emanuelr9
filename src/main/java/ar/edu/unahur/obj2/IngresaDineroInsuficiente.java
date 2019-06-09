package ar.edu.unahur.obj2;

public abstract class IngresaDineroInsuficiente implements Estado {

    @Override
    public void servierGaseosa(int precio, double dineroIngresado){

        int total;
        total = (int) (dineroIngresado - precio);

        System.out.print("El dinero es insuficiente, restan poner:" + total );





    }
}
