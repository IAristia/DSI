package org.example.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    @DisplayName("Inscripción de materias sin correlativas")

    public void inscripciónMateriasPrimerAño() {

        Alumno alumno1 = new Alumno(123);
        Materia aga = new Materia("AGA");
        Materia am1 = new Materia("AM1");
        Inscripcion inscripcion1 = new Inscripcion(alumno1);

        inscripcion1.agregarMateriasAInsc(aga, am1);

        Assertions.assertTrue(inscripcion1.aprobada());
    }

    @Test
    @DisplayName("Inscripción exitosa de materias con correlativas")

    public void inscripciónExitosaMateriasSegundoAño() {

        Alumno alumno1 = new Alumno(123);
        Materia aga = new Materia("AGA");
        Materia am1 = new Materia("AM1");
        Materia ayed = new Materia("AYED");
        Materia pdep = new Materia("PDEP");
        Materia am2 = new Materia("AM2");

        alumno1.aprobarMaterias(aga,am1,ayed);

        Inscripcion inscripcion1 = new Inscripcion(alumno1);

        pdep.agregarCorrelativas(ayed);
        am2.agregarCorrelativas(am1,aga);

        inscripcion1.agregarMateriasAInsc(am2, pdep);

        Assertions.assertTrue(inscripcion1.aprobada());
    }

@Test
@DisplayName("Inscripción rechazada de materias con correlativas")

public void inscripciónRechazadaMateriasSegundoAño() {

    Alumno alumno1 = new Alumno(123);
    Materia aga = new Materia("AGA");
    Materia am1 = new Materia("AM1");
    Materia ayed = new Materia("AYED");
    Materia pdep = new Materia("PDEP");
    Materia am2 = new Materia("AM2");

    alumno1.aprobarMaterias(am1,ayed);

    pdep.agregarCorrelativas(ayed);
    am2.agregarCorrelativas(am1,aga);

    Inscripcion inscripcion1 = new Inscripcion(alumno1);

    inscripcion1.agregarMateriasAInsc(am2, pdep);

    Assertions.assertFalse(inscripcion1.aprobada());
    }
}