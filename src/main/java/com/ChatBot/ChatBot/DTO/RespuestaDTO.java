package com.ChatBot.ChatBot.DTO;

import com.ChatBot.ChatBot.DTO.OpcionDTO;
import java.util.List;

public class RespuestaDTO {

    private String respuesta;
    private List<OpcionDTO> opciones;

    // ✅ Constructor vacío (necesario para deserialización si usas Jackson)
    public RespuestaDTO() {
    }

    // ✅ Constructor correcto usado en tu servicio
    public RespuestaDTO(String respuesta, List<OpcionDTO> opciones) {
        this.respuesta = respuesta;
        this.opciones = opciones;
    }

    // Getters y setters
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public List<OpcionDTO> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<OpcionDTO> opciones) {
        this.opciones = opciones;
    }
    
}
