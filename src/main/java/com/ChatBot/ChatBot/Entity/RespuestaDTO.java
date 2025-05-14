package com.ChatBot.ChatBot.Entity;


import java.util.List;

public class RespuestaDTO {
    private Integer id;
    private String pregunta;
    private String respuesta;
    private List<String> opciones;

    public RespuestaDTO() {
    }

    public RespuestaDTO(Integer id, String pregunta, String respuesta, List<String> opciones) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.opciones = opciones;
    }

    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPregunta() { return pregunta; }
    public void setPregunta(String pregunta) { this.pregunta = pregunta; }

    public String getRespuesta() { return respuesta; }
    public void setRespuesta(String respuesta) { this.respuesta = respuesta; }

    public List<String> getOpciones() { return opciones; }
    public void setOpciones(List<String> opciones) { this.opciones = opciones; }
}
