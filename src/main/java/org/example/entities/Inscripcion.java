package org.example.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribir;

    public Inscripcion (Alumno alumno){
        this.alumno = alumno;
        this.materiasAInscribir = new ArrayList<>();
    }

    public List<Materia> getMateriasAInscribir() {
        return materiasAInscribir;
    }

    public void agregarMateriasAInsc(Materia ... materias){
        Collections.addAll(this.materiasAInscribir, materias);
    }

    public Boolean aprobada(){
        List<Materia> correlativasDeTodasLasMateriasAInscribir = this.materiasAInscribir
                .stream()
                .flatMap(materia -> materia.getCorrelativas().stream())
                .collect(Collectors.toList());

    return this.alumno.getMateriasAprobadas().containsAll(correlativasDeTodasLasMateriasAInscribir);
    }
}

