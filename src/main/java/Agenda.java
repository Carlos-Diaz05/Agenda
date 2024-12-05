import java.util.List;
public class Agenda {
  private List<Evento> eventos;

  public Agenda(List<Evento> eventos ) {//Manejador de la lista
    this.eventos = eventos;
  }

  public void agregarEvento(Evento evento) {//Manejador de la lista (poner eventos)
    eventos.add(evento);
  }

  public void eliminarEvento(Evento evento) {//Manejador de la lista (borrar eventos)
    eventos.remove(evento);
  }

  public List<Evento> getEventos() {
    return eventos;
  }
}