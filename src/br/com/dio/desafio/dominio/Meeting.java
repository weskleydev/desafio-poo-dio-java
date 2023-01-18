package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Meeting extends Conteudo {

    private Set<String> guests = new LinkedHashSet<>();

    public Set<String> getGuests() {
        return guests;
    }

    public void setGuests(Set<String> guests) {
        this.guests = guests;
    }

    public Meeting() {
    }

    @Override
    public String toString() {
        return "Reunião{" +
                "data='" + getDate() + '\'' +
                "hora='" + getHour() + '\'' +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", participantes='" + getGuests() + '\'' +
                '}';
    }
}
