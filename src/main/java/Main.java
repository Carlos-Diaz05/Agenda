// import static
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  
public static Agenda agenda = new Agenda(new ArrayList<Evento>(Arrays.asList(new Evento("Evento 1", "Lunes", "10:00", "Lugar 1", "Descripcion 1", 1))));
  public static Evento evento = new Evento("Evento 2", "Martes", "11:00", "Lugar 2", "Descripcion 2", 2);
  
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    
    agenda.agregarEvento(evento);
   verEventos();
    
  } 

  public static void verEventos() {
    for(Evento evento : agenda.getEventos()) {
      System.out.print(evento.getNombre()+" |");
      System.out.print(evento.getDia()+" |");
      System.out.print(evento.getHora()+" |");
      System.out.print(evento.getLugar()+" |");
      System.out.print(evento.getDescripcion()+" |");
      System.out.println(evento.getId());
    }
  }
}