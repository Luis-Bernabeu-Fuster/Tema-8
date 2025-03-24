package Actividad3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaTest {
    @Test
    public void testFormaToString() {
        assertEquals("Forma{nombre='Esfera'}", new Forma("Esfera").toString());
        assertEquals("Forma{nombre='Rectangulo'}", new Forma("Rectangulo").toString());
        assertEquals("Forma{nombre='Cilindro'}", new Forma("Cilindro").toString());
    }

    @Test
    public void testFormaDevolverArea() {
        assertEquals(4 * Math.PI * Math.pow(15, 2), new Esfera("Esfera", 15).getArea());
        assertEquals(20 * 35, new Rectangulo("Rectangulo", 20, 35).getArea());
        assertEquals(Math.PI * Math.pow(10, 2) * 30, new Cilindro("Cilindro", 30, 10).getArea());
    }
}

class PinturaTets {
    @Test
    public void testCalcularPintura(){
        assertEquals(11.309,new Pintura(250).calcularPintura( new Esfera("Esfera",15)),0.01);
        assertEquals(2.8,new Pintura(250).calcularPintura(new Rectangulo("Rectangulo",20,35)),0.01);
        assertEquals(37.699,new Pintura(250).calcularPintura(new Cilindro("Cilindro",30,10)),0.01);
    }
}