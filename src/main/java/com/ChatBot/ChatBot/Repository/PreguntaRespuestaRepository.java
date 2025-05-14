package com.ChatBot.ChatBot.Repository;

import com.ChatBot.ChatBot.Entity.PreguntaRespuesta;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaRespuestaRepository extends JpaRepository<PreguntaRespuesta, Integer>{
    Optional<PreguntaRespuesta> findByPreguntaIgnoreCase(String pregunta);
}
