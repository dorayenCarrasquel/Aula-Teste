package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

    @Test
    public void testarMetodoDeConversaoNumerosRomanos(){
        String resultado = new Conversor().converterParaNumeroRomano(5478);

        Assert.assertEquals("_VCDLXXVIII", resultado);
    }
}
