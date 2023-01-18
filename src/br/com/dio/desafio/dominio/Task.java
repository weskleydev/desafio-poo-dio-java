package br.com.dio.desafio.dominio;

public class Task extends Conteudo{

    private int priority;

    


   

   
    public String getPriority() {
        switch (priority) {
            case 1:
                return "Baixa";
            case 2:
                return "Média";

            case 3:
                return "Alta";
        
            default:
            return "Baixa";
        }
        
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Task() {
    }


    @Override
    public String toString() {
        return "Curso{" +
                "data='" + getDate() + '\'' +
                "hora='" + getHour() + '\'' +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", Prioridade='" + getPriority() + '\'' +
                '}';
    }
}
