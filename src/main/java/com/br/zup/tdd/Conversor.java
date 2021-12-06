package com.br.zup.tdd;

import static java.util.Collections.nCopies;
import static java.lang.String.join;

public class Conversor {
    //Metodo explicado na página https://iteracao.info/java-conversao-de-decimais-em-romanos/
    //Utiliza so metodos estaticos a ser importados join e nCopies:
    //https://www.w3resource.com/java-tutorial/string/string_join.php
    //https://www.tutorialspoint.com/java/util/collections_ncopies.htm


    public static final int[] DECIMAIS =
            {5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANOS =
            {"_V","_IV","M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String converterParaNumeroRomano(int numeroConvertir) {
        if(numeroConvertir > 0) {
            StringBuilder resultado = new StringBuilder();
            for (int i = 0; i < DECIMAIS.length; i++) {
                int parteInteira = numeroConvertir / DECIMAIS[i];
                numeroConvertir -= DECIMAIS[i] * parteInteira;
                resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
            }
            return resultado.toString();
        }
        throw new RuntimeException("Não é possivel convertir números negativos");
    }

    }
