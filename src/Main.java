
import br.com.dio.desafio.dominio.Meeting;
import br.com.dio.desafio.dominio.Schedule;
import br.com.dio.desafio.dominio.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task();
        task1.setTitulo("Limpar a Piscina");
        task1.setDescricao("descrição de limpar a piscina");
        task1.setDate("18/01/2023");
        task1.setHour("08:00");
        task1.setPriority(2);

        Meeting meeting1 = new Meeting();
        meeting1.setTitulo("Reunião de Liderança da empresa");
        meeting1.setDescricao("descrição da reunião de Liderança da empresa");
        meeting1.setDate("19/01/2023");
        meeting1.setHour("10:00");         
        meeting1.getGuests().add("João");
        meeting1.getGuests().add("Kamily");
        meeting1.getGuests().add("Weskley");
       
        Schedule schedule = new Schedule();
        schedule.setNome("Agenda do dia " + LocalDate.now());
        schedule.setDescricao("Descrição da Agenda do dia");
        System.out.println(schedule);
         schedule.getConteudos().add(task1);
         schedule.getConteudos().add(meeting1);
         System.out.println(schedule);
       
    }

}
