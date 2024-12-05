public class AgendaTest {
  public static void runtest() {
    testAgregarEvento();
  }

  public static void testAgregarEvento() {
    Evento evento = new Evento("Evento 1", "Lunes", "10:00", "Lugar 1", "Descripcion 1", 0);
    evento.setNombre("tarea");
    evento.setDia("Martes");
    evento.setHora("11:00");
    evento.setLugar("Lugar 2");
    evento.setDescripcion("Descripcion 2");
    evento.setId(1);
    if(evento.getNombre().equals("tarea") && evento.getDia().equals("Martes") && evento.getHora().equals("11:00") && evento.getLugar().equals("Lugar 2") && evento.getDescripcion().equals("Descripcion 2") && evento.getId() == 1) {
      System.out.println("Test correcto :)");
    }
    else {
      System.out.println("Test incorrecto :(");
    }
  }
}