public class Evento {
  private String nombre;
  private String dia;
  private String hora;
  private String lugar;
  private String descripcion;
  private int id;
  
  public Evento(String nombre, String dia, String hora, String lugar, String descripcion, int id){
    this.nombre = nombre;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.descripcion = descripcion;
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDia() {
    return dia;
  }

  public String getHora() {
    return hora;
  }

  public String getLugar() {
    return lugar;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getId() {
    return id;
  }
}