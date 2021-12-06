package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

    @Test
    public void testarMetodoDeConversaoNumerosRomanos(){
        String resultado = new Conversor().converterParaNumeroRomano(5478);

        Assert.assertEquals("_VCDLXXVIII", resultado);
    }

    @Test
    //precisa de Lambda para testar as exception, logo de um bloco de execução lembrar colocar ";"
    // cuando el método es estatico no precisa instanciar com new solo llamar directamente caso contrario utilizar new.
    public void testarMetodoDeConversaoNumerosRomanosCaminhoNegativo(){
        Assert.assertThrows(RuntimeException.class, () -> {Conversor.converterParaNumeroRomano(-500);});
    }
}
