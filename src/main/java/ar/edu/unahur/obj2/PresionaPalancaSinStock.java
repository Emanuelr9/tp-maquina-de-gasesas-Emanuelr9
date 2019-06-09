package ar.edu.unahur.obj2;

public class PresionaPalancaSinStock implements Estado {

    @Override
    public void ejecutarAccion() {

        System.out.print("Esta maquina se encuntra sin stock");
    }

}