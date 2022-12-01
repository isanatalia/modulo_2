package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String nome;
    String sobrenome;
    LocalDate dataNascimento;

    String saudacao (){
        return String
                .format("Olá, meu nome é %s %s tenho %d",nome,sobrenome,dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS));

    }



}
