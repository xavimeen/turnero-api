package com.turnero.api.service;

import com.turnero.api.model.Turno;
import com.turnero.api.repository.TurnoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurnoServiceImpl implements TurnoService {

    private final TurnoRepository turnoRepository;

    public TurnoServiceImpl(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    @Override
    public void reservarTurno(Turno turno) {
        turnoRepository.save(turno);
    }

    @Override
    public List<Turno> listarTurnos() {
        return turnoRepository.findAll();
    }
}
