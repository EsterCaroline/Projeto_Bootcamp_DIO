package com.desafio_poo.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Curso da liguagem java");
    curso1.setCargaHoraria(140);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso Kotlin");
    curso2.setDescricao("Curso da linguagem kotlin");
    curso2.setCargaHoraria(120);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Java Avançado");
        curso3.setDescricao("Curso da linguagem java Avançado");
        curso3.setCargaHoraria(100);

        Curso curso4 = new Curso();
        curso4.setTitulo("Curso Kotlin Avançado");
        curso4.setDescricao("Curso da linguagem Kotlin Avançado");
        curso4.setCargaHoraria(100);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(curso3);
    System.out.println(curso4);
    System.out.println(mentoria);
    }
}
