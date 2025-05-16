
package com.ChatBot.ChatBot.DTO;

import java.util.List;


public class PreguntaDTO {
    private String pregunta;
    private String respuesta;
    private List<Opcion> opciones;

    public PreguntaDTO() {
    }

    public PreguntaDTO(String pregunta, String respuesta, List<Opcion> opciones) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.opciones = opciones;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    
}
