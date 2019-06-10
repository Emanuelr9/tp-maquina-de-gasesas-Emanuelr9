package ar.edu.unahur.obj2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IngresaDineroInsuficienteTest {

    @Test
    public void testServirGaseosa() {

        MaquinaDeGaseosas maquina1 = new MaquinaDeGaseosas(0,5,0,assertTrue());
        maquina1.setPrecioGaseosa(30);
        maquina1.setDineroIngresado(10);
    }
}