package com.br.zup.tdd;

import org.junit.Assert;

public class ConversorTest {

    public void testarMetodoDeConversaoNumerosRomanos(){
        String resultado = new Conversor().converterParaNumeroRomano(5478);

        Assert.assertEquals("_VCDLXXVIII", resultado);
    }
}
