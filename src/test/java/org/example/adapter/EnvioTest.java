package test.java.org.example.adapter;

import adapter.Envio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnvioTest {
    @Test
    public void deveRetornarTamanhoEnvio(){
        Envio envio = new Envio();
        envio.setPacote("XG");

        assertEquals("XG", envio.getPacote());
    }

    @Test
    public void deveRetornarPrecoEnvio(){
        Envio envio = new Envio();
        envio.setPacote("XG");

        assertEquals(100.0f, envio.getPreco());
    }
}
