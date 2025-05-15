package com.ChatBot.ChatBot.Service;

import com.ChatBot.ChatBot.DTO.OpcionDTO;
import com.ChatBot.ChatBot.Entity.PreguntaRespuesta;
import com.ChatBot.ChatBot.DTO.RespuestaDTO;

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
        PreguntaRespuesta encontrado = repository.findByPregunta(pregunta);

        if (encontrado == null) {
            return new RespuestaDTO("Lo siento, no tengo una respuesta para eso.", null);
        }

        List<OpcionDTO> opciones = null;
        try {
            if (encontrado.getOpciones() != null && !encontrado.getOpciones().isBlank()) {
                ObjectMapper mapper = new ObjectMapper();
                opciones = mapper.readValue(encontrado.getOpciones(), new TypeReference<List<OpcionDTO>>() {});
            }
        } catch (Exception e) {
            e.printStackTrace(); // Puedes registrar el error con logger si prefieres
        }

        return new RespuestaDTO(encontrado.getRespuesta(), opciones);

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
