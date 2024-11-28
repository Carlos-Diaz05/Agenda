import java.util.List;
public class Agenda {
  private List<Evento> eventos;

  public Agenda(List<Evento> eventos ) {
    this.eventos = eventos;
  }

  public void agregarEvento(Evento evento) {
    eventos.add(evento);
  }

  public void eliminarEvento(Evento evento) {
    eventos.remove(evento);
  }

  public List<Evento> getEventos() {
    return eventos;
  }
}