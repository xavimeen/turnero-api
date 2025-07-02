package com.turnero.api.service;

import com.turnero.api.model.Turno;
import java.util.List;

public interface TurnoService {

    void reservarTurno(Turno turno);
    List<Turno> listarTurnos();

}
