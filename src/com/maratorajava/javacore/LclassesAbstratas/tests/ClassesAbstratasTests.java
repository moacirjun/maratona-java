package com.maratorajava.javacore.LclassesAbstratas.tests;

import com.maratorajava.javacore.LclassesAbstratas.classes.Programador;
import com.maratorajava.javacore.LclassesAbstratas.classes.ProgramadorPJ;

public class ClassesAbstratasTests {
    public static void main(String[] args) {
        Programador p = new Programador("Moacir", "123123123-12", 5000);
        ProgramadorPJ pj = new ProgramadorPJ("Charlinhos Menezes", "32132131-21", 9000, 1200);

        p.calculaSalarioLiquido();
        pj.calculaSalarioLiquido();

        System.out.println(p);
        System.out.println(pj);
    }
}
