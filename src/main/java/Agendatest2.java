import java.util.ArrayList;
import java.util.List;
public class Agendatest2 {
  public static void runtest2() {
    testEliminarEvento();
  }

  public static void testEliminarEvento() {
    List<Evento> eventos = new ArrayList<Evento>();
    Evento evento = new Evento("Evento 1", "Lunes", "10:00", "Lugar 1", "Descripcion 1", 0);
    eventos.remove(evento);  

    if(eventos.size() == 0) {
      System.out.println("Test correcto :)");
    }
    else {
      System.out.println("Test incorrecto :(");
    }
  }
}