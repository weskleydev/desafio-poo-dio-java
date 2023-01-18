package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Conteudo {

    private String titulo;
    private String descricao;
    private String date;
    private String hour;

    public String getHour() {
        return hour;
    }

    public String setHour(String hour) {

        DateTimeFormatter formatHour = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.parse(hour, formatHour);
        return this.hour = formatHour.format(localTime);
    }

    public String getDate() {
        return date;
    }

    public String setDate(String date) {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatDate);
        return this.date = formatDate.format(localDate);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
