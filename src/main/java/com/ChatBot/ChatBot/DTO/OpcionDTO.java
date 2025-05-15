package com.ChatBot.ChatBot.DTO;



public class OpcionDTO {
    private String texto;
    private String pregunta;

    public OpcionDTO() {}

    public OpcionDTO(String texto, String pregunta) {
        this.texto = texto;
        this.pregunta = pregunta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
}

