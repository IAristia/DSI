package org.example.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {
    @Test
    @DisplayName("AGA no tiene correlativas")

    public void sinCorrelativas() {

        Materia aga = new Materia("AGA");

        Assertions.assertTrue(aga.getCorrelativas().isEmpty());
    }

    @Test
    @DisplayName("AM2 tiene como correlativa a AGA")

    public void AGAesCorrelativaDeAM2() {

        Materia aga = new Materia("AGA");
        Materia am2 = new Materia("AM2");
        am2.agregarCorrelativas(aga);

        Assertions.assertTrue(am2.getCorrelativas().contains(aga));
    }


    @Test
    @DisplayName("AM2 no tiene como correlativa a AyED")

    public void AYEDnoEsCorrelativaDeAM2() {

        Materia ayed = new Materia("AYED");
        Materia am2 = new Materia("AM2");

        Assertions.assertFalse(am2.getCorrelativas().contains(ayed));
    }
}
