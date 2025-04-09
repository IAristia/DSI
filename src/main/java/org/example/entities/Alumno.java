package org.example.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {

    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(Integer legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
        }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void aprobarMaterias(Materia ... materias) {
        Collections.addAll(this.materiasAprobadas, materias);
    }

}