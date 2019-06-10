package ar.edu.unahur.obj2;

public class MaquinaDeGaseosas {

    private  Estado miEstado;
    private double dineroIngresado;
    private int stock;
    private int precioGaseosa=30;




    public MaquinaDeGaseosas(Estado miEstado, double dineroIngresado, int stock,int precioGaseosa) {
        this.miEstado = miEstado;
        this.dineroIngresado = dineroIngresado;
        this.stock = stock;
        this.precioGaseosa=precioGaseosa;
    }


    public void setEstado(Estado e){
        this.miEstado = e;
    }

    public void servirGaseosa(){
        miEstado.servirGaseosa(precioGaseosa,dineroIngresado);

    }

    public void sinStock(){
        miEstado.sinStock(dineroIngresado,stock);
    }

    public int getPrecioprecioGaseosa() {
        return precioGaseosa;
    }

    public double getDineroIngresado() {
        return dineroIngresado;
    }
}
