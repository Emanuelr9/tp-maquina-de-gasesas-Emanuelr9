package ar.edu.unahur.obj2;

public class MaquinaDeGaseosas {


    private double dineroIngresado;
    private int stock;
    private int precioGaseosa;
    private boolean precionaPalanca;
    private  Estado estado;



    public MaquinaDeGaseosas(double dineroIngresado, int stock, int precioGaseosa,boolean precionaPalanca) {

        this.dineroIngresado = dineroIngresado;
        this.stock = stock;
        this.precioGaseosa=precioGaseosa;
        this.precionaPalanca = precionaPalanca;


    }



    public void setEstado(Estado e){
        this.estado = e;
    }


    public void ejecutarAccion(){
        estado.ejecutarAccion(precioGaseosa,dineroIngresado,stock,precionaPalanca);

    }


    public int getPrecioprecioGaseosa() {
        return precioGaseosa;
    }

    public double getDineroIngresado() {
        return dineroIngresado;
    }

    public boolean isPrecionaPalanca() {
        return precionaPalanca;
    }

    public void setDineroIngresado(double dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecioGaseosa(int precioGaseosa) {
        this.precioGaseosa = precioGaseosa;
    }

    public void setPrecionaPalanca(boolean precionaPalanca) {
        this.precionaPalanca = precionaPalanca;
    }
}
