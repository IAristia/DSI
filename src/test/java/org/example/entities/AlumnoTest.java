package org.example.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    @Test
    @DisplayName("Test alumno aprobó AGA")

    public void agregarMateriaAprobada() {

    Alumno alumno1 = new Alumno(123);
    Materia aga = new Materia("AGA");
    alumno1.aprobarMaterias(aga);

    Assertions.assertTrue(alumno1.getMateriasAprobadas().contains(aga));
    }

    @Test
    @DisplayName("Test alumno no aprobó AGA")

    public void noAgregarMateriaAprobada() {

        Alumno alumno1 = new Alumno(123);
        Materia aga = new Materia("AGA");

        Assertions.assertFalse(alumno1.getMateriasAprobadas().contains(aga));
    }


    @Test
    @DisplayName("Test alumno aprobó AGA pero no AyED")

    public void agregarSoloMateriaAprobada() {

        Alumno alumno1 = new Alumno(123);
        Materia aga = new Materia("AGA");
        Materia ayed = new Materia("AyED");
        alumno1.aprobarMaterias(aga);

        Assertions.assertTrue(alumno1.getMateriasAprobadas().contains(aga) && !alumno1.getMateriasAprobadas().contains(ayed));
    }

}