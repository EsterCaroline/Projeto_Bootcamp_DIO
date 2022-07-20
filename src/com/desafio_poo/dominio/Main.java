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

    Conteudo conteudo1 = new Curso();
    Conteudo conteudo = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEster =new Dev();
        devEster.setNome("Ester");
        devEster.inscreverBootcamp(bootcamp);
        devEster.progredir();
        devEster.progredir();
        devEster.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Ester:" + devEster.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ester:" + devEster.getConteudosConcluidos());
        System.out.println("XP" + devEster.calcularTotalXp());

        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP" + devJoao.calcularTotalXp());

    /*System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(curso3);
    System.out.println(curso4);
    System.out.println(mentoria);
     */
    }
}
