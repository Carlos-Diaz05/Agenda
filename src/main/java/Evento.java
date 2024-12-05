public class Evento {
  private String nombre;
  private String dia;
  private String hora;
  private String lugar;
  private String descripcion;
  private int id;
  
  public Evento(String nombre, String dia, String hora, String lugar, String descripcion, int id){//Constructor
    this.nombre = nombre;
    this.dia = dia;
    this.hora = hora;
    this.lugar = lugar;
    this.descripcion = descripcion;
    this.id = id;
  }

  //A parir de aqui para abajo es el get de cada atributo
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

  //A parir de aqui para abajo es el set de cada atributo
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDia(String dia) {
    this.dia = dia;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public void setLugar(String lugar) {
    this.lugar = lugar;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setId(int id) {
    this.id = id;
  }
}