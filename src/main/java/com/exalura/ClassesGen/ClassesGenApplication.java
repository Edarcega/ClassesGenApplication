package com.exalura.ClassesGen;

import com.exalura.ClassesGen.services.Avaliacao;
import com.exalura.ClassesGen.services.entities.Produto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ClassesGenApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ClassesGenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando");
        Produto a = new Produto("TV", 10.5);
        Produto b = new Produto("Rádio", 50.2);
        Avaliacao aa = new Avaliacao(a, "Bom", 10);
        Avaliacao ab = new Avaliacao(b, "Ruim", 5);
        System.out.println(Avaliacao.calcularMediaNotas(Arrays.asList(aa, ab)));
    }
}
