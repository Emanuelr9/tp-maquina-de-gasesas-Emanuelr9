package ar.edu.unahur.obj2;

public class MaquinaDeGaseosas {

    private  Estado miEstado;
    private double dineroIngresado;
    private int stock;
    private int precioGaseosa=30;
    private boolean precionaPalanca;



    public MaquinaDeGaseosas(double dineroIngresado, int stock, int precioGaseosa,boolean precionaPalanca) {
        this.miEstado = miEstado;
        this.dineroIngresado = dineroIngresado;
        this.stock = stock;
        this.precioGaseosa=precioGaseosa;
        this.precionaPalanca = precionaPalanca;

    }



    public void setEstado(Estado e){
        this.miEstado = e;
    }


    public void servirGaseosa(){
        miEstado.servirGaseosa(precioGaseosa,dineroIngresado,precionaPalanca);

    }

    public void sinStock(){
        miEstado.sinStock(dineroIngresado,stock,precionaPalanca);
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
