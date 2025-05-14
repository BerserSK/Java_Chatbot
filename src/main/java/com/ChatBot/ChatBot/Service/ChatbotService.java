package com.ChatBot.ChatBot.Service;

import com.ChatBot.ChatBot.Entity.PreguntaRespuesta;
import com.ChatBot.ChatBot.Entity.RespuestaDTO;
import com.ChatBot.ChatBot.Repository.PreguntaRespuestaRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ChatbotService {

    private final PreguntaRespuestaRepository repository;
    private final ObjectMapper objectMapper;

    public ChatbotService(PreguntaRespuestaRepository repository) {
        this.repository = repository;
        this.objectMapper = new ObjectMapper();
    }

    public RespuestaDTO responder(String pregunta) {
        Optional<PreguntaRespuesta> encontrada = repository.findByPreguntaIgnoreCase(pregunta.trim());

        if (encontrada.isPresent()) {
            PreguntaRespuesta entity = encontrada.get();
            List<String> opcionesParsed = parsearOpciones(entity.getOpciones());

            return new RespuestaDTO(
                    entity.getId(),
                    entity.getPregunta(),
                    entity.getRespuesta(),
                    opcionesParsed
            );
        } else {
            return new RespuestaDTO(null, pregunta, "Lo siento, no tengo respuesta para eso.", Collections.emptyList());
        }
    }

    private List<String> parsearOpciones(String opcionesJson) {
        try {
            if (opcionesJson == null || opcionesJson.trim().isEmpty()) return Collections.emptyList();
            return objectMapper.readValue(opcionesJson, new TypeReference<List<String>>() {});
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }
}
