package com.ChatBot.ChatBot.DTO;


public class RegistroPreguntaDTO {
    private String pregunta;
    private String respuesta;
    private String opciones; // puede ser null

    public RegistroPreguntaDTO() {
    }

    public RegistroPreguntaDTO(String pregunta, String respuesta, String opciones) {
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

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }
}

