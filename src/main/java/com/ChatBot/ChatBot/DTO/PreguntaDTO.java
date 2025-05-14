
package com.ChatBot.ChatBot.DTO;


public class PreguntaDTO {
    private String pregunta;

    public PreguntaDTO() {
    }

    public PreguntaDTO(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}
