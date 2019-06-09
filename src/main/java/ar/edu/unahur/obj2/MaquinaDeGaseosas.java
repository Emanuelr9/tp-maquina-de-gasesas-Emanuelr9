package ar.edu.unahur.obj2;

public class MaquinaDeGaseosas {

    private  Estado miEstado;
    private double dineroIngresado;
    private int stok;
    private boolean presionaPalanca=true;



    public MaquinaDeGaseosas(Estado miEstado, double dineroIngresado, int stok,boolean presionaPalanca) {
        this.miEstado = miEstado;
        this.dineroIngresado = dineroIngresado;
        this.stok = stok;
        this.presionaPalanca=presionaPalanca;
    }




}
