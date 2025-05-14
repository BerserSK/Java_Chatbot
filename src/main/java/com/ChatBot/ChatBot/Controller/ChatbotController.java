package com.ChatBot.ChatBot.Controller;

import com.ChatBot.ChatBot.DTO.PreguntaDTO;
import com.ChatBot.ChatBot.DTO.RegistroPreguntaDTO;
import com.ChatBot.ChatBot.Service.ChatbotService;
import com.ChatBot.ChatBot.Entity.PreguntaRespuesta;
import com.ChatBot.ChatBot.Entity.RespuestaDTO;
import com.ChatBot.ChatBot.Repository.PreguntaRespuestaRepository;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chatbot")
public class ChatbotController {
    @Autowired
    private ChatbotService chatbotService;

    @PostMapping("/pregunta")
    public ResponseEntity<RespuestaDTO> responder(@RequestBody PreguntaDTO dto) {
        return ResponseEntity.ok(chatbotService.responder(dto.getPregunta()));
    }
    
    @Autowired
    private PreguntaRespuestaRepository repository;

    @PostMapping("/registrar")
    public ResponseEntity<PreguntaRespuesta> registrar(@RequestBody RegistroPreguntaDTO dto) {
        PreguntaRespuesta nueva = new PreguntaRespuesta();
        nueva.setPregunta(dto.getPregunta());
        nueva.setRespuesta(dto.getRespuesta());
        nueva.setOpciones(dto.getOpciones());
        return ResponseEntity.ok(repository.save(nueva));
    }
    
}

