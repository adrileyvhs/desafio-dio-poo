package esafiodiopoo.desafiodiopoo;

import esafiodiopoo.desafiodiopoo.entitites.Curso;

public class MainCursos {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setDescricao("Curso");
        curso.setCargaHoraria(10);
        curso.setTitulo("JAva Dev");

        System.out.println(curso);

    }
}
