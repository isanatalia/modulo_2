package org.example;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Digite Nome:");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        System.out.println("Digite Sobrenome:");
        String sobrenome = scanner.next();
        System.out.println("Digite a sua data de nascimento: dd/mm/yyyy");
        LocalDate dataNascimento = LocalDate.parse(scanner.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.printf("Olá, meu nome é %s %s tenho %d",nome,sobrenome,LocalDate.now().getYear()-dataNascimento.getYear());
        System.out.printf("Olá, meu nome é %s %s tenho %d",nome,sobrenome,dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS));



    }
}
