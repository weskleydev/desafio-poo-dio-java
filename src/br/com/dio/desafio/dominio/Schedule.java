package br.com.dio.desafio.dominio;

// import java.time.LocalDate;
// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Schedule {
    private String nome;
    private String descricao;
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, conteudos);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "titulo='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", Conteúdo=" + getConteudos() +
                '}';
    }
}
