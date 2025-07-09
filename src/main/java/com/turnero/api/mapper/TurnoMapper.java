package com.turnero.api.mapper;

import com.turnero.api.dto.TurnoRequestDto;
import com.turnero.api.model.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TurnoMapper {

    public Turno toEntity(TurnoRequestDto dto) {
        Turno turno = new Turno();
        turno.setClienteId(dto.getClienteId());
        turno.setServicioId(dto.getServicioId());
        turno.setProfesionalId(dto.getProfesionalId());
        turno.setFechaHora(dto.getFechaHora());
        turno.setDuracionMinutos(dto.getDuracionMinutos());
        turno.setEstado(dto.getEstado());
        turno.setObservaciones(dto.getObservaciones());
        turno.setCreadoEn(LocalDateTime.now());
        turno.setActualizadoEn(LocalDateTime.now());

        return turno;
    }
}
