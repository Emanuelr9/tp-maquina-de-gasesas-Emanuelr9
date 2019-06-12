package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMaquinaDeGaseosas {

    MaquinaDeGaseosas maquina =new MaquinaDeGaseosas(0,0,0,false);


    IngresaDineroInsuficiente estado1 = new IngresaDineroInsuficiente();

    IngresaDineroSinStock estado2 = new IngresaDineroSinStock();

    PresionaSinIngresarDinero estado3 = new PresionaSinIngresarDinero();

    PresionaSinStock estado4 = new PresionaSinStock();


    @BeforeMethod
    public void setUp() {

    }

    @Test
    public void testIngresaDineroInsuficiente(){

        maquina.setEstado(estado1);
        maquina.setPrecioGaseosa(70);
        maquina.setDineroIngresado(20);

        maquina.ejecutarAccion();
    }

    @Test
    public void  testIngresaDineroSinStock(){
        maquina.setEstado(estado2);
        maquina.setStock(0);
        maquina.setDineroIngresado(80);

        maquina.ejecutarAccion();
    }

    @Test
    public void testPresionaSinIngresarDinero(){

      maquina.setEstado(estado3);
      maquina.setPrecioGaseosa(100);
      maquina.setPrecionaPalanca(true);

      maquina.ejecutarAccion();
    }

    @Test
    public void testPresionaSinStock(){

        maquina.setEstado(estado4);
        maquina.setStock(0);
        maquina.setPrecionaPalanca(true);

        maquina.ejecutarAccion();
    }

    //Test para cambiar los valores directamente desde el constructor. Los distintos estados se setean
    // de la maquinaNueva()

    @Test

    public void TestSinSeteo(){

        MaquinaDeGaseosas maquinaNueva= new MaquinaDeGaseosas(15,10,50,true);

        maquinaNueva.setEstado(estado1);
        maquinaNueva.ejecutarAccion();
    }

}