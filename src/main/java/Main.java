// import static
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner leer = new Scanner(System.in);
  
public static Agenda agenda = new Agenda(new ArrayList<Evento>(Arrays.asList(new Evento("Evento 1", "Lunes", "10:00", "Lugar 1", "Descripcion 1", 0))));
  public static Evento evento = new Evento("Evento 2", "Martes", "11:00", "Lugar 2", "Descripcion 2", 0);
  
  public static void main(String[] args) {
    int opcion;
    
    do {
      //Pantalla de inicio
      System.out.println("-----------------------------");
      System.out.println("Bienvenido que decea hacer?");
      System.out.println("1. Agregar evento");
      System.out.println("2. Eliminar evento");
      System.out.println("3. Ver eventos");
      System.out.println("4. Salir");
      System.out.println("-----------------------------");
      agenda.agregarEvento(evento);
      opcion = leer.nextInt();
      leer.nextLine();
      switch (opcion){
        case 1:
          agregarEvento();//agregar evento
          break;
          
        case 2:
          verEventos();
          eliminarEvento();//Eliminar eventos
          break;
          
        case 3:
          verEventos();//Ver eventos
          break;

        default:
          System.out.println("Adios :(");
      }
      
} while (opcion != 4);
  } 

  public static void verEventos() {//Metodo para ver eventos
    for(Evento evento : agenda.getEventos()) {
      System.out.print(evento.getNombre()+" |");
      System.out.print(evento.getDia()+" |");
      System.out.print(evento.getHora()+" |");
      System.out.print(evento.getLugar()+" |");
      System.out.print(evento.getDescripcion()+" |");
      System.out.println(evento.getId());
    }
  }

  public static void agregarEvento() {//Metodo para agregar eventos
    System.out.println("Ingrese el id del evento");
    int newId = leer.nextInt();
    leer.nextLine();
    System.out.println("Ingrese el nombre del evento");
    String newNombre = leer.next();
    System.out.println("Ingrese el dia del evento");
    String newDia = leer.next();
    System.out.println("Ingrese la hora del evento");
    String newHora = leer.next();
    System.out.println("Ingrese el lugar del evento");
    String newLugar = leer.next();
    System.out.println("Ingrese la descripcion del evento");
    String newDescripcion = leer.next();
    agenda.agregarEvento(new Evento(newNombre, newDia, newHora, newLugar, newDescripcion, newId));
    System.out.println("Evento agregado correctamente :)");
  }

  public static void eliminarEvento() {//Metodo para eliminar eventos
    System.out.println("Ingrese el id del evento que desea eliminar");
    int id = leer.nextInt();
    leer.nextLine();
    for(Evento evento : agenda.getEventos()) {
      if(evento.getId() == id) {
        agenda.eliminarEvento(evento);
        System.out.println("Evento eliminado correctamente :)");
      }
    }
  }
}