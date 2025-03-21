package Actividad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    public void testFormaToString(){
        assertEquals("Forma{nombre='Esfera'}",new Forma("Esfera").toString());
        assertEquals("Forma{nombre='Rectangulo'}",new Forma("Rectangulo").toString());
        assertEquals("Forma{nombre='Cilindro'}",new Forma("Cilindro").toString());
    }

    @Test
    public void testFormaDevolverArea(){
       assertEquals(4*Math.PI*Math.pow(15,2),new Esfera("Esfera",15).getArea());
       assertEquals(20*35,new Rectangulo("Rectangulo",20,35).getArea());
       assertEquals(Math.PI*Math.pow(10,2)*30,new Cilindro("Cilindro",30,10).getArea());
    }

    @Test
    public void testCalcularPintura(){
        assertEquals(4*Math.PI*Math.pow(15,2)/250,new Pintura(250).calcularPintura( new Esfera("Esfera",15)));
        assertEquals((20*35)/250.0,new Pintura(250).calcularPintura(new Rectangulo("Rectangulo",20,35)));
        assertEquals(Math.PI*Math.pow(10,2)*30/250,new Pintura(250).calcularPintura(new Cilindro("Cilindro",30,10)));
    }
}